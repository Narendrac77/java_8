package src.leetcode.challenges.day2;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Approach 1
    public int[] twoSum(int nums[], int target){
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i]))
                return new int[]{map.get(target-nums[i]),i};
            else
                map.put(nums[i],i);
        }
        return new int[]{ -1, -1};
    }
    // Approach 2
    public int[] twoSumTwo(int nums[], int target){
        int response[]=new int[2];

         for (int i=0;i<nums.length-1;i++){
             for(int j=i+1;j<nums.length;j++){
                 if (nums[i]+nums[j]==target){
                     response[0]=i;
                     response[1]=j;
                     break;
                 }
             }
         }
         return response;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        twoSum.test1();
        System.out.println();
        twoSum.test2();
        System.out.println();
        twoSum.test3();
    }

    public void test1(){
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int result[] = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public void test2(){
        int nums[] = {3, 2, 4};
        int target = 6;
        int result[] = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public void test3(){
        int nums[] = {3, 3};
        int target = 6;
        int result[] = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
