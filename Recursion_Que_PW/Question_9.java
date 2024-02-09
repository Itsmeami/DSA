import java.util.Scanner;
public class Question_9 {
    // <-----Recursion Method----->
    public static int GCD(int x, int y) {
        if(y == 0) {
            return x;
        }
        return GCD(y, x%y);
    }


    // <----Intreation Mthod--->
    public static int iGCD(int x , int y) {
        while(x % y != 0) {
            int rem = x % y;
             x = y;
            y = rem;

        }
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("GCD of two numbers using loop : " + iGCD(x,y));
        System.out.println("GCD of two numbers using recursion : " + GCD(x,y));
    }

}
