package Backtracking;

public class Question5 {
    public static void print(int sr, int sc, int er, int ec, String s, int[][] maze) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        if(maze[sr][sc] == 0) return; // blocked
        if(maze[sr][sc] == -1) return; // Already Visited

        maze[sr][sc] = -1;

        // Go Right
        print(sr,sc+1,er,ec,s+"R",maze);

        // Go Down
        print(sr+1,sc, er, ec , s+"D", maze);

        // Go left
        print(sr, sc-1, er, ec, s+"L", maze);

        // Go  Up
        print(sr-1, sc, er, ec, s+"U", maze);

        maze[sr][sc] = 1;

    }
    public static void main(String[] args) {
        int row = 3;
        int col = 4;
        int[][] maze = {{1,0,1,1},
                       {1,1,1,1},
                       {1,1,0,1}};
        print(0,0,row-1,col-1,"",maze);
    }
}
