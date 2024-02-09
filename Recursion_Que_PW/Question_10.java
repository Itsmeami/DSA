public class Question_10 {
    public static int MaxValue(int[] arr, int idx) {
        if(idx == arr.length-1) return arr[idx];
        int smallAns = MaxValue(arr, idx+1);
        return Math.max(arr[idx], smallAns);
    }
    public static void main(String[] args) {
        int[] arr = {5,8,3,2,1};
        System.out.println(MaxValue(arr,0));
    }
}
