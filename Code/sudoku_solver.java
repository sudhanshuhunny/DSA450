package Code;

public class sudoku_solver {
    public static void main(String[] args) {
        int [][] board = { {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
         {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
         {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
         {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
         {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
         {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
         {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
         {0, 0, 5, 2, 0, 6, 3, 0, 0} };

        
    }
    public static void sudoku(int[][] board,int row,int col){
        if(row==9){
            return;
        }
        if(col==9){
            sudoku(board,row+1,col);
            return;
        }

        if(board[row][col]==0)
        {
            
            //processing
            for (int i = 1; i <=9; i++) {
                if(isSafe(board,row,col,i)){
                    board[row][col]=i;
                    
                    
                }
            
            }

        }
        else{
            sudoku(board,row,col+1);
        }
    }

    public static boolean isSafe(int[][] board, int row, int col, int i) {
        return false;
    }

}
