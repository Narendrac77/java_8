package src.algorithms.sortingalgorithms;

import java.util.Arrays;
import java.util.Collections;



public class QuickSort {

    public static int count = 0;

    public static void main(String[] args) {
      //  int[] input = {9, 2, 6, 4, 3, 5, 1 };
        int[] input = {10, 7, 8, 9, 1, 5};
        System.out.println(Arrays.toString(input));
        quickSort(input);
        System.out.println(Arrays.toString(input));

    }

    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int[] arr, int left, int right) {
        if(left >= right){
            return;
        }
        int pivot = arr[(left + right)/2];
        int index = partition(arr, left, right, pivot);
        quickSort(arr, left, index-1);
        quickSort(arr, index, right);
    }

    private static int partition(int[] arr, int left, int right, int pivot) {
        while (left <= right){
            while (arr[left] < pivot){
                left++;
            }
            while (arr[right] > pivot){
                right--;
            }
            if(left <= right){
                swap(arr,left,right);
                left++;
                right--;
                count++;
                System.out.println("Iteration " +count + " " +Arrays.toString(arr));
            }
        }
        return left;
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
