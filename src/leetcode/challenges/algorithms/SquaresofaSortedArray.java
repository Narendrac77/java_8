package src.leetcode.challenges.algorithms;
//Given an integer array nums sorted in non-decreasing order,
// return an array of the squares of each number sorted in non-decreasing order.
//

//Example 1:
//
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//After sorting, it becomes [0,1,9,16,100].
//Example 2:
//
//Input: nums = [-7,-3,2,3,11]
//Output: [4,9,9,49,121]

import java.util.Arrays;

public class SquaresofaSortedArray {

    public int[] sortedSquare(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i] * nums[i]);
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        SquaresofaSortedArray sortedArray = new SquaresofaSortedArray();
        sortedArray.test1();
        sortedArray.test2();
    }

    public void test1() {
        int nums[] = {-4, -1, 0, 3, 10};
        int result[] = sortedSquare(nums);
        System.out.println(Arrays.toString(result));
        int nums2[] = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(nums2)));
    }

    public void test2() {
        int nums[] = {-7,-3,2,3,11};
        int result[] = sortedSquare(nums);
        System.out.println(Arrays.toString(result));
    }

    public int[] sortedSquares(int[] arr) {
        int i =0;
        int j = arr.length - 1;
        int[] res = new int[arr.length];
        int x = arr.length - 1;
        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                res[x--] = arr[i] * arr[i];
                i++;
            } else {
                res[x--] = arr[j] * arr[j];
                j--;
            }
        }

        return res;
    }
}
