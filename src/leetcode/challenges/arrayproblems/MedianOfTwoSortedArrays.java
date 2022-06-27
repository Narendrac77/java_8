package src.leetcode.challenges.arrayproblems;

import java.util.Arrays;

//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//The overall run time complexity should be O(log (m+n)).
//
//
//
//Example 1:
//
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.
//Example 2:
//
//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5
public class MedianOfTwoSortedArrays {

    // Satisfies only when two arrays have same length
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num3[] = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length || j < nums2.length) {
            if (i == nums1.length) {
                num3[k] = nums2[j];
                j++;
            } else if (j == nums2.length) {
                num3[k] = nums1[i];
                i++;
            } else if (nums1[i] < nums2[j]) {
                num3[k] = nums1[i];
                i++;
            } else {
                num3[k] = nums2[j];
                j++;
            }
            k++;
        }
        System.out.println(Arrays.toString(num3));
        return  num3.length%2 != 0 ? num3[num3.length/2] : (num3[num3.length/2] + num3[(num3.length/2)-1])/(double)2;
    }

    public static void main(String[] args) {
        MedianOfTwoSortedArrays sortedArrays = new MedianOfTwoSortedArrays();
        sortedArrays.test1();
    }

    public void test1() {
        int nums1[] = {1, 3}, nums2[] = {2, 3, 4};
        findMedianSortedArrays(nums1, nums2);
    }

}
