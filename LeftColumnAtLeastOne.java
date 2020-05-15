package array;

public class LeftColumnAtLeastOne {

    public int leftColumn(int[][] arr, int n,int m){
        int result = -1;
        int i = 0;
        int j = m-1;
        while(i<n && j >= 0){

            if(arr[i][j] == 1){
                result = j;
                j = j-1;
            }else{
                i = i+1;
            }

        }


        return result;
    }

    public static void main(String[] args){
        int[][] arr = {{0,0},{1,1}};
        int n = arr.length;
        int m = arr[n-1].length;
        LeftColumnAtLeastOne leftColumnAtLeastOne = new LeftColumnAtLeastOne();
        System.out.println(leftColumnAtLeastOne.leftColumn(arr,n,m));
    }
}
