package src.leetcode.challenges.arrayproblems;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        RemoveDuplicates duplicates = new RemoveDuplicates();
        duplicates.test1();
        duplicates.test2();
        duplicates.test3();
        ;
    }

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1)
            return n;
        int[] temp = new int[n];

        // Start traversing elements
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            // If current element is not equal
            // to next element then store that
            // current element
            if (nums[i] != nums[i + 1])
                temp[j++] = nums[i];

        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        temp[j++] = nums[n - 1];

        // Modify original array
        for (int i = 0; i < j; i++)
            nums[i] = temp[i];

        return j;
    }

    public void test1() {
        int nums[] = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
        int n = removeDuplicates(nums);
        for (int i = 0; i < n; i++)
            System.out.print(nums[i] + " ");
    }

    public void test2() {
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
        int n = removeDuplicates(nums);
        for (int i = 0; i < n; i++)
            System.out.print(nums[i] + " ");    }

    public void test3() {
        int nums[] = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
        int n = removeDuplicates(nums);
        for (int i = 0; i < n; i++)
            System.out.print(nums[i] + " ");    }
}
