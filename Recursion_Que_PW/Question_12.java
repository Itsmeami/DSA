public class Question_12 {
    public static void PrintArray(int[] arr, int idx) {
        if(idx == arr.length-1) {
            System.out.print(arr[idx]);
            return;
        }
        System.out.print(arr[idx] + " ");
        PrintArray(arr,idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        PrintArray(arr,0);
    }
}
