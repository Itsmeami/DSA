// Question 14 : Given an array arr of size N ans an integer X. The task is to find all the indices of the integer X in the array.

public class Question_14 {
    public static void PrintTargetIndex(int[] arr, int target, int idx) {
        if(idx == arr.length) return;
        if(arr[idx] == target) {
            System.out.print(idx + " ");
        }
        PrintTargetIndex(arr, target, idx + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,5};
        int target = 2;
        PrintTargetIndex(arr,target,0);
    }
}
