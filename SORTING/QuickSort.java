package SORTING;

public class QuickSort {
    public static void displayArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int st, int end) {
        int count = 0;
        int pivot = arr[st];
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot) count++;

        }
        int pivotIdx = st + count;
        swap(arr, st, pivotIdx);
        int i = st, j = end;

        // element lesser or equal -> left side pivotIdx && Element Greater -> right side pivotIdx
        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }

        }
        return pivotIdx;
    }

    public static void quickSort(int[] arr, int st, int end) {
        if (st >= end) return;
        int pi = partition(arr, st, end);
        quickSort(arr, st, pi - 1);
        quickSort(arr, pi + 1, end);
    }


    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Array Before Sorting");
        displayArray(arr);
        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array After Sorting");
        displayArray(arr);
    }

}