import java.util.Scanner;
public class Question_8 {
    public static int AlternateSum(int n) {
        if(n == 0) return 0;
        if(n % 2 == 0) return AlternateSum(n-1) - n;
        else return AlternateSum(n-1) + n;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        System.out.println(AlternateSum(nums));


    }
}
