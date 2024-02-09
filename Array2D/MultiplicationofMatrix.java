package Array2D;

import java.util.Scanner;

public class MultiplicationofMatrix {

        public static void printMatrix(int[][] arr, int r1, int c1) {
            for(int i=0; i<r1; i++) {
                for(int j=0; j<c1; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void mulMatrix(int[][] a, int r1, int c1 , int[][] b, int r2, int c2) {
            if (c1 != r2) {
                System.out.println("INVALID INPUT -- Matrix Multiplication is not Possible");
                return;
            }

            int[][] mul = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k< r2; k++) {
                        mul[i][j] += a[i][k] * b[i][k];
                    }
                }
            }
            printMatrix(mul, r1, c1);
        }

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
            System.out.println("<---MUL--->");
            mulMatrix(a,r1,c1,b,r2,c2);

        }
}
