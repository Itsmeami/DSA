package SORTING_QUE;
// Question - Given an integer array arr, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.
// INPUT- 0,5,0,3,42     OUTPUT - 5,3,42,0,0
// In this code we use the bubble sort
public class Question_1 {
    public static void main(String[] args) {
        int[] arr = {0,5,0,3,42};
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] == 0 && arr[j+1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int val: arr) {
            System.out.print(val + " ");
        }

    }
}
