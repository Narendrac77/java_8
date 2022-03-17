package src.leetcode.challenges.day3;

import java.util.*;

//Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
//Example 1:
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]
//Example 2:
//
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [4,9]
//Explanation: [9,4] is also accepted.
public class IntersectionofTwoArrays {

    public int[] intersect(int nums[], int nums2[]){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
         for (int i = 0 ; i < nums.length; i++){
            map.put(i,nums[i]);
        }
        for (int j = 0; j < nums2.length ;j++) {
           if(map.containsValue(nums2[j])){
               list.add(nums2[j]);
               map.remove(nums2[j]);
        }
        }
        int result[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        IntersectionofTwoArrays intersectionofTwoArrays = new IntersectionofTwoArrays();
        intersectionofTwoArrays.test1();
        intersectionofTwoArrays.test2();
        intersectionofTwoArrays.test3();
        intersectionofTwoArrays.test4();
    }


    public void test1(){
        int nums1[] = {1, 2, 2, 1}, nums2[] = {2,2};
        int[] intersect = intersect(nums1, nums2);
        System.out.println(Arrays.toString(intersect));
    }

    public void test2(){
        int nums1[] = {4, 9, 5}, nums2[] = {9, 4, 9, 8, 4};
        int[] intersect = intersect(nums1, nums2);
        System.out.println(Arrays.toString(intersect));
    }

    public void test3(){
        System.out.println("Approach - 2");
        int nums1[] = {4, 9, 5}, nums2[] = {9, 4, 9, 8, 4};
        int[] intersect = intersectTwo(nums1, nums2);
        System.out.println(Arrays.toString(intersect));
    }

    public void test4(){
        System.out.println("Approach - 2");
        int nums1[] = {1, 2, 2, 1}, nums2[] = {2,2};
        int[] intersect = intersectTwo(nums1, nums2);
        System.out.println(Arrays.toString(intersect));
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Algorithm
    // - Build a hashmap with the frequency counts for numbers in one of the arrays
    // - Traverse through other array, if the num is found in the hashmap
    // - Then add it to the result and reduce frequency in hashmap
    // Second Approach
    public int[] intersectTwo(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num: nums2) {
            Integer count = map.get(num);
            if(count != null && count > 0) {
                list.add(num);
                map.put(num, count - 1);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();

    }



}
