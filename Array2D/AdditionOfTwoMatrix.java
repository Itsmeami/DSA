package Array2D;
import java.util.Scanner;



public class AdditionOfTwoMatrix {

    public static void printMatrix(int[][] arr, int r1, int c1) {
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c1; j++) {
              System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void addMatrix(int[][] a, int r1, int c1 , int[][] b, int r2, int c2) {
        if(r1 != r2 || c1!=c2){
            System.out.println("Matrix Addition is not Possible");
            return;
        }
        int r3 = r1;
        int c3 = c1;
        int[][] sum = new int[r1][c1];
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c1; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

//    private static void printArray(int[][] sum, int r3, int c3) {
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and number of columns in Matrix-1 : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter the element of Matrix-1 : ");
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the number of rows and number of columns in Matrix-2 : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r1][c1];
        System.out.println("Enter the element of Matrix-2 : ");
        for(int i=0; i<r2; i++) {
            for(int j=0; j<c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix-1");
        printMatrix(a,r1,c1);
        System.out.println("Matrix-2");
        printMatrix(b,r2,c2);
        System.out.println("Sum");
        addMatrix(a,r1,c1,b,r2,c2);

    }
}
