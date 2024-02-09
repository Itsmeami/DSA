package Backtracking;

public class Question7 {
    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        // check row
        for(int j=0; j<n; j++) {
            if(board[row][j] == 'Q') return false;
        }

        // Check column
        for(int i=0; i<n; i++) {
            if(board[i][col] == 'Q') return false;
        }

        // Check northEast
        int i=row;
        int j=col;
        while(i>=0 && j<n) {
            if(board[i][j] == 'Q') return false;
            i--;
            j++;
        }

        // Check south East
         i=row;
         j=col;
        while(i < n && j<n) {
            if(board[i][j] == 'Q') return false;
            i++;
            j++;

        }

        // Check south west
        i=row;
        j=col;
        while(i<n && j>=0) {
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }

        // Check North West
        i = row;
        j = col;
        while(i>=0 && j>=0) {
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }
         return true;

    }
    public static void nQueen(char[][] board, int row) {
        int n = board.length;
        if(row == n) { // Base Case
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for(int j=0; j<n; j++) { // Work and Call
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                nQueen(board,row+1);
                board[row][j] = '.'; // BackTracking
            }

        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }
        nQueen(board,0);
    }
}
