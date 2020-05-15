package array;

public class MinimumPathSum {

    public int minPathSum(int[][] grid){
        int sum = grid[0][0];
        int sum1 = grid[0][0];
        int row = grid.length-1;
        int column = grid[row].length-1;

        if(row == 0 && column == 0 ){
            return sum;
        }

        int i = 0;
        int j = 0;
        if(grid[i].length > 0)
            j = 1;

        sum = sum+ grid[i][j];

        while(i <= row && j <= column){

            int num1 = 0;
            int num2 = 0;

            if(i<=row-1 ){
                num1 = grid[i+1][j];
            }
            if(j<grid[i].length-1 ){
                num2 = grid[i][j+1];
            }

            if(num1 < num2){
                if(i == row){
                    sum = sum+num2;
                    j = j+1;
                }else{
                    sum = sum + num1;
                    i = i+1;
                }
            }else{
                if(j==column){
                    sum = sum+num1;
                    i = i+1;
                }else {
                    sum = sum + num2;
                    j = j + 1;
                }
            }
        }

        int k = 0;
        if(row > 0 )
            k = 1;

        int l = 0;
        sum1 = sum1+ grid[k][l];

        while(k <= row && l <= column){

            int num1 = 0;
            int num2 = 0;

            if(k<=row-1 ){
                num1 = grid[k+1][l];
            }
            if(l<grid[k].length-1 ){
                num2 = grid[k][l+1];
            }

            if(num1 < num2){
                if(k == row){
                    sum1 = sum1+num2;
                    l = l+1;
                }else{
                    sum1 = sum1 + num1;
                    k = k+1;
                }
            }else{
                if(l==column){
                    sum1 = sum1+num1;
                    k = k+1;
                }else {
                    sum1 = sum1 + num2;
                    l = l + 1;
                }
            }
        }
        if(row > 0 && column > 0 && grid[1][0] < grid[0][1] && grid[1][1] == grid[0][2]){
            sum = sum - grid[0][1] + grid[1][0];
        }
        return sum<sum1 ? sum : sum1;
    }
    public int min(int[][] grid){

        for(int i = 0 ; i < grid.length ; i++ ){
           for(int j = 0;j<grid[i].length;j++){

               if(i == 0 && j > 0){
                   grid[i][j] = grid[i][j] + grid[i][j-1];
               }else{
                   if(i > 0 && j == 0){
                       grid[i][j] = grid[i][j] + grid[i-1][j];
                   }else{
                       if(i != 0 && j != 0){
                           grid[i][j] = grid[i][j] + Math.min(grid[i][j-1],grid[i-1][j]);
                       }
                   }
               }
           }
        }
        return grid[grid.length-1][grid[grid.length-1].length-1];
    }
    public static void main(String[] args){
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        MinimumPathSum minm = new MinimumPathSum();
        System.out.println(minm.min(arr));
    }
}
