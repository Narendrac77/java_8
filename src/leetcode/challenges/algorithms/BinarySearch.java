package src.leetcode.challenges;

/*Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

        You must write an algorithm with O(log n) runtime complexity.*/
//Example 1
/*Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4*/

//Example 2
/*Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1*/
public class BinarySearch {

    public static void main(String[] args) {
        test1();
        test12();
    }

    public static void test1() {
        int nums[] = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target));
    }

    public static void test12() {
        int nums[] = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {

        // Approach-1

       /* if(nums.length!=0){
        for(int i = 0; i<nums.length; i++){
            if(nums[i]== target)
                return i;
        }
    }
        return -1;*/

        //Approach -2

      /*  int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
           int mid = (start+end)/2;
            if(nums[mid]==target)
                return mid;
            else if(target<nums[mid])
                end = mid-1;
            else if(target>nums[mid])
                start = mid+1;

        }
        return ans;*/

        //Approach 3

        int end = nums.length - 1;
        int mid = 0, start = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;
            if (target > nums[mid])
                start = mid + 1;
            else if (target < nums[mid])
                end = mid - 1;
        }
        return -1;
    }
}
