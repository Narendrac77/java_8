package src.leetcode.challenges;

import java.util.*;

//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: false
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true

//Using Map & Set
//Using Arrays Function
public class ContainsDuplicate {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    public static void test1() {
        int[] nums = {1, 2, 3, 1};
        System.out.println("Using Map " + containsDuplicate(nums));
        System.out.println("Using Set " + containsDuplicateTwo(nums));
        System.out.println("Using arrays function " + containsDuplicateThree(nums));
    }

    public static void test2() {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Using Map " + containsDuplicate(nums));
        System.out.println("Using Set " + containsDuplicateTwo(nums));
        System.out.println("Using arrays function " + containsDuplicateThree(nums));
    }

    public static void test3() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Using Map " + containsDuplicate(nums));
        System.out.println("Using Set " + containsDuplicateTwo(nums));
        System.out.println("Using arrays function " + containsDuplicateThree(nums));
    }

    // Approach 1
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else
                return true;
        }
        return false;
    }

    //Approach 2

    public static boolean containsDuplicateTwo(int nums[]) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                return true;
            set.add(i);
        }
        return false;
    }

    //Approach 3

    public static boolean containsDuplicateThree(int nums[]) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}
