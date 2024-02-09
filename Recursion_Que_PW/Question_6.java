public class Question_6 {
//    public static double pow(double x,int n) {
//        if(n==0) return 1;
//        return x * pow(x,n-1);
//
//    }

    public static double pow(double x,int n) {
        if(n==0) return 1;
        double temp = pow(x,n/2);
        if(n % 2 == 0) {
            return temp * temp;
        }
        else return temp * temp * x;
    }
    public static void main(String[] args) {
        double x = 2;
        int n = 3;
        int N = n;
        if(N < 0) {
            x = 1/x;
            N = -N;
        }
        System.out.println(pow(x,N));

    }
}
