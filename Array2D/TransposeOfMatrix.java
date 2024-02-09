package Array2D;
import java.util.Scanner;
public class TransposeOfMatrix {
    public static void print_Matrix(int[][] arr, int r, int c) {
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix, int r, int c ) {
        int[][] ans = new int[c][r];

        for(int i=0; i<c; i++) {
            for(int j=0; j<r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and column : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] maritx = new int[r][c];
        int total = r*c;
        System.out.println("Enter  " + total + " elements");
        for(int i=0;i<r; i++) {
            for(int j=0; j<c; j++) {
                maritx[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input");
        print_Matrix(maritx,r,c);

        int[][] ans = transpose(maritx, r,c);
        System.out.println("OUTput");
        print_Matrix(ans, c,r);


    }
}
