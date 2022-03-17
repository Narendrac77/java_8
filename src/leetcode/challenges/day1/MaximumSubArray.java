package src.leetcode.challenges.day1;
//Given an integer array nums, find the contiguous subarray (containing at least one number)
// which has the largest sum and return its sum.
//A subarray is a contiguous part of an array.

//Example 1:
//
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
//Example 2:
//
//Input: nums = [1]
//Output: 1
//Example 3:
//
//Input: nums = [5,4,-1,7,8]
//Output: 23

public class MaximumSubArray {

    public int maxSubArray(int nums[]){
        int maxSoFar= Integer.MIN_VALUE;
        int maxEndingHere = 0;
        for(int i:nums){
            maxEndingHere = maxEndingHere+i;
            if(maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
            if(maxEndingHere < 0)
                maxEndingHere = 0;
        }
        return maxSoFar;
    }

    //Kadane's Algorithm used
    public int maxSubArrayTwo(int nums[]){
        int count = 0;
        int result = 0;
        for(int i : nums){
            count = Math.max(count + i, result);
            result = Math.max(count, result);
        }
        return result;
    }

    public static void main(String[] args) {
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        System.out.println("*****************  Approach - One ********** ");
       // maximumSubArray.test1();
       // maximumSubArray.test2();
        maximumSubArray.test3();
       // maximumSubArray.test4();
       // maximumSubArray.test5();
       // maximumSubArray.test6();
        System.out.println("*****************  Approach - Two ********** ");
       // maximumSubArray.test1();
       // maximumSubArray.test2();
        maximumSubArray.test3();
       // maximumSubArray.test4();
       // maximumSubArray.test5();
       // maximumSubArray.test6();
    }

    public void test1(){
        int nums[] = {5, 9, -18, 7, 8, -23};
        int maxSubArray = maxSubArray(nums);
        System.out.println(maxSubArray);
    }

    public void test2(){
        int nums[] = {5, 9, -18, 7, 3, -23};
        int maxSubArray = maxSubArray(nums);
        System.out.println(maxSubArray);
    }

    public void test3(){
        int nums[] = {-2,1,-3,4,-1,2,1,-5,23};
        int maxSubArray = maxSubArray(nums);
        System.out.println(maxSubArray);
    }

    public void test4(){
        int nums[] = {1};
        int maxSubArray = maxSubArray(nums);
        System.out.println(maxSubArray);
    }

    public void test5(){
        int nums[] = {5,4,-1,7,8};
        int maxSubArray = maxSubArray(nums);
        System.out.println(maxSubArray);
    }

    public void test6(){
        int nums[] = {-1};
        int maxSubArray = maxSubArray(nums);
        System.out.println(maxSubArray);
    }


}
