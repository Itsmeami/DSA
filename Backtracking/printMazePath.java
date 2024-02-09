package Backtracking;

public class printMazePath {
    public static void print(int sr, int sc, int er, int ec, String s) {
        if(sr>er || sc>ec) return;
        if(sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        // If we go one step right
        print(sr, sc+1, er, ec, s+"R");

        // If we go one step down
        print(sr+1, sc, er, ec, s+"D");
    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        print(1,1,row,col,"");
    }
}
