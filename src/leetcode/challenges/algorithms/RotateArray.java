package src.leetcode.challenges.algorithms;

import java.util.Arrays;
import java.util.Random;

//Given an array, rotate the array to the right by k steps, where k is non-negative.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
//Example 2:
//
//Input: nums = [-1,-100,3,99], k = 2
//Output: [3,99,-1,-100]
//Explanation:
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]
public class RotateArray {

    public static void main(String[] args) {
    int nums[] = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;
        RotateArray array = new RotateArray();
    //    array.rotate(nums, k);
        array.rotateTwo(nums, k);

    }

    public void rotate(int nums[], int k) {
        int arr2[] = Arrays.copyOf(nums, nums.length);
      /* int arr1[] = new int[nums.length];
       for(int i = 0; i < k ; i++){
           arr1[i] = nums[(nums.length+i)-k];
       }
        System.out.println(Arrays.toString(arr1));
       int j = k;
       for (int i = 0; i < nums.length-k; i++){
           arr1[j++] = nums[i];
       }*/

        for (int i = 0; i < k; i++) {
            nums[i] = arr2[(arr2.length + i) - k];
        }
        System.out.println(Arrays.toString(arr2));
        int j = k;
        for (int i = 0; i < arr2.length - k; i++) {
            nums[j++] = arr2[i];
        }
            System.out.println("After rotation");
            System.out.println(Arrays.toString(nums));
        }

    //Approach 2   {1, 2, 3, 4, 5, 6, 7}  k =3
    public void rotateTwo(int[] nums, int k) {
        int[] arr= new int[nums.length];
        for(int i=0;i<nums.length;i++)
            arr[(i+k)%nums.length]=nums[i];
        for(int i=0;i<nums.length;i++)
            nums[i]=arr[i];
    }
    }


