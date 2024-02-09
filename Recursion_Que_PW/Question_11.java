public class Question_11 {
    public static int ArraySum(int[] arr , int idx) {
        if(idx == arr.length-1) return arr[idx];
        return arr[idx] + ArraySum(arr, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,7,3,4,5};
        System.out.println(ArraySum(arr,0));
    }
}
