package src.gfg;

import java.util.Arrays;
//Move all zeroes to end of array
//Given an array of random numbers, Push all the zero’s of a given array to the end of the array. F
// or example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed to
// {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements should be same. Expected time complexity is O(n) and extra space is O(1).

//Example:

//Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
//Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
//
//Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
//Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
public class MoveAllZeroToEnd {

    public static void main(String[] args) {
        MoveAllZeroToEnd moveAllZeroToEnd = new MoveAllZeroToEnd();
        moveAllZeroToEnd.test();
        moveAllZeroToEnd.test2();
        moveAllZeroToEnd.test3();
    }

    public void test() {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        int nums[] = moveAllZeroToEnd(arr);
        System.out.println(Arrays.toString(nums));
        System.out.println("Second Approach ");
        pushZerosToEnd(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public void test2(){
       int arr[]  = {1, 2, 0, 0, 0, 3, 6};
        int nums[] = moveAllZeroToEnd(arr);
        System.out.println(Arrays.toString(nums));
        System.out.println("Second Approach ");
        pushZerosToEnd(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public void test3(){
        int nums[] = { 0, 0, 3, 5, 0, 4, 0, 2};  // { 3, 5, 4, 2, 0, 0, 0, 0}
        int arr[] = moveAllZeroToEnd(nums);
        System.out.println("Balaji provided input need to test : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Second Approach ");
        pushZerosToEnd(nums, nums.length);
        System.out.println(Arrays.toString(nums));

    }

    public static int[] moveAllZeroToEnd(int nums[]) {
        int indexWithZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[indexWithZero] != 0)
                indexWithZero++;
            if (indexWithZero < i && nums[i] != 0) {
                nums[indexWithZero] = nums[i];
                nums[i] = 0;
            }
        }
        return nums;
    }

    static void pushZerosToEnd(int arr[], int n)
    {
        int count = 0;  // Count of non-zero elements

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
        // incremented

        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < n)
            arr[count++] = 0;
    }

}


