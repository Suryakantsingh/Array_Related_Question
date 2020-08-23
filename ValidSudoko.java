/********
VALID SUDOKO

*Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
*
*/
class Solution {
    static int[] row = {2, 5, 8};
    static int[] column = {2, 5, 8};

    public boolean isValidSudoku(char[][] board) {
       int row = board.length;
        int column = board[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                if (board[i][j] != '.') {
                    if( checkInRowColumn(board, i, j) ){
                        if(!checkGrid(board,i,j)) {
                            return false;
                        }
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean checkInRowColumn(char[][] board, int i, int j) {

        boolean result = true;
        int number = board[i][j];

        for (int k = 0; k < board[i].length; k++) {

            if (k != j && board[i][k] == board[i][j]) {
                return false;
            }
        }

        for (int k = 0; k < board.length; k++) {

            if (k != i && board[k][j] == board[i][j]) {
                return false;
            }
        }
        return result;
    }

    public boolean checkGrid(char[][] board, int i, int j) {

        int number = board[i][j];
        int rowLast = 0;
        int columnLast = 0;

        for( int k = 0; k<row.length; k++ ){
            if(i<=row[k]){
                rowLast = row[k];
                break;
            }
        }

        for( int l = 0; l<column.length; l++ ){
            if(j<=column[l]){
                columnLast = column[l];
                break;
            }
        }
        for(int m=rowLast-2;m<=rowLast;m++){
            for(int n = columnLast-2;n<=columnLast;n++) {
                if(m != i && n != j && board[m][n] == number ){
                    return false;
                }
            }
        }
      return true;  
    }
}
