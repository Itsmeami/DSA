package Backtracking;

public class Question4 {
    public static void print(int sr, int sc, int er, int ec, String s, int[][] arr) {
        if(sr>er || sc>ec) return;
        if(arr[sr][sc] == 0) return;
        if(sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        //GO Forward
        print(sr, sc+1, er, ec, s+"R", arr);

        // Go Downword
        print(sr+1,sc, er, ec, s+"D", arr);
    }
    public static void main(String[] args) {
        int row = 4;
        int col = 6;
        int[][] arr = {{1,0,1,1,1,1},
                       {1,1,1,1,0,1},
                       {0,1,1,1,1,1},
                       {0,0,1,0,1,1}};
        print(0,0,row-1,col-1,"", arr);
    }
}
