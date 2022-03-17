package src.leetcode.challenges.algorithms;
//Given a sorted array of distinct integers and a target value,
// return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.

//Example 1:
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:
//
//Input: nums = [1,3,5,6], target = 7
//Output: 4
public class SearchInsertPosition {

    public static int searchInsert(int nums[], int target){
        int result = 0;

        if(nums[0] == target){
            return 0;
        }

        if(nums[nums.length-1] < target){
            return nums.length;
        }
        for(int i = 1; i< nums.length; i++){
            if(nums[i] == target || (nums[i-1] < target && nums[i] > target))
                return i;

        }
        return result;
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        searchInsertPosition.test1();
        searchInsertPosition.test2();
        searchInsertPosition.test3();
    }

    public void test1(){
            int nums[] = {1, 3, 5, 6};
            int target = 7;
        System.out.println(searchInsert(nums, target));
        }

    public void test2(){
        int nums[] = {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    public void test3(){
        int nums[] = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }
    }

