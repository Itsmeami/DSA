package Backtracking;

public class Question3 {
    public static void print(int sr, int sc, int er, int ec, String s, boolean[][] isVisited ) {
        if(sr<0 || sc <0) return;
        if(sr> er || sc > ec) return;
        if(isVisited[sr][sc] == true) return;
        if(sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        // Go right
        print(sr,sc+1,er,ec, s+"R",isVisited);

        // Go Down
        print(sr+1, sc, er, ec, s+"D", isVisited);

        // Go Left
        print(sr, sc-1, er, ec, s+"L", isVisited);

        // Go Up
        print(sr-1, sc, er, ec , s+"U", isVisited);
        isVisited[sr][sc] = false;


    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        boolean[][] isVisited = new boolean[row][col];
        print(0,0,row-1,col-1,"", isVisited);
    }
}
