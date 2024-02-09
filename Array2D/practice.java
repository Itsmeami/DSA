package Array2D;
import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = {{1,2,3},
                        {4,5,6}};
        int[][] arr2 = {{7,8,9}, 
                        {10,11,12}};
        int row = arr1.length;
        int column = arr1[0].length;
        int[][] res = new int[row][column];
        System.out.println(row);
        System.out.println(column);
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                res[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                System.out.print(res[i][j] + " " );
            }
            System.out.println();
        }


    }
}
