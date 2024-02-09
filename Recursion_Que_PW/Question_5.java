public class Question_5 {
    public static int CountNumberOfDigit(int n) {
        if(n>=0 && n<=9) return 1;
        return CountNumberOfDigit(n/10) + 1;
    }
    public static void main(String[] args) {
        int n = 234555;
        System.out.println("The number of digit in " + n + " is : " + " " +CountNumberOfDigit(n));
    }
}
