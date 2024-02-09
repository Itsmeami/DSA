package Backtracking;
//Count the total number
// In this question we have only two option either we go right or we go down.
public class MazePath {
    // sr = startingRow, sc = StartingColumn, er = EndingRow , ec = EndingColumn
    public static int maze(int sr, int sc, int er, int ec) {

        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;
        // In the 3 * 3 grid if we go one step down then we have a gird of 2*3 and we have to perform our operation on it.
        int downWays = maze(sr+1, sc, er, ec);

        // if we go one step right then we have a grid of 3 * 2 we have to perform our operation on it.
        int rightWays = maze(sr, sc+1, er, ec);

        int totalWays = downWays + rightWays;
        return totalWays;
    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int count = maze(1,1,row,col);
        System.out.println(count);
    }
}
