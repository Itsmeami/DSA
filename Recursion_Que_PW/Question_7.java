public class Question_7 {
    public static void DigitMultiple(int nums, int k) {
        if(k==0) {
//            System.out.print(nums + " ");
            return;
        }
        DigitMultiple(nums,k-1);
        System.out.print(nums*k + " ");
        return;

    }
    public static void main(String[] args) {
        int nums = 12;
        int k = 5   ;
        DigitMultiple(nums,k);
    }

}
