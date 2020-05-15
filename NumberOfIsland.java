package array;

public class NumberOfIsland {

    public int numIslands(char[][] grid) {

        int count = 0, i, j;
        for(i=0;i<grid.length;i++){
            for(j=0;j<grid[i].length;j++){
                if(grid[i][j] == '1'){
                    count += 1;
                    findSurroundings(grid, i, j);
                }
            }
        }
        return count;
    }

    private void findSurroundings(char[][]grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        findSurroundings(grid, i+1, j);
        findSurroundings(grid, i-1, j);
        findSurroundings(grid, i, j-1);
        findSurroundings(grid, i, j+1);
    }


    public static void main(String[] args){
        char[][] ch = {{'1','1','1','1','0'},
                       {'1','1','0','1','0'},
                       {'1','1','0','0','0'},
                       {'0','0','0','0','0'}};
        NumberOfIsland numberOfIsland = new NumberOfIsland();
        System.out.println(numberOfIsland.numIslands(ch));
    }
}
