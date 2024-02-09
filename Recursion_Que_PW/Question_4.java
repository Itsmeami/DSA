// Question - Given an integer , find out the sum of it's digit using recursion
import java.util.Scanner;
public class Question_4 {
    public  static int SumOfDigit(int n) {
        if(n>=0 && n<=9) return n;
//        return SumOfDigit(n/10) + n%10;
        int temp = SumOfDigit(n/10);
        int ans = temp + n%10;
        return ans;

    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number to find the Sum of digit : ");
       int n = sc.nextInt();
       System.out.println(SumOfDigit(n));


    }
}
