package src.leetcode.challenges.algorithms;

//Problem Statement
/*You are a product manager and currently leading a team to develop a new product.
Unfortunately, the latest version of your product fails the quality check.
Since each version is developed based on the previous version, all the versions after a bad version are also bad.
Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 which causes all the following ones to be bad.
You are given an API bool isBadVersion(version) which returns whether version is bad.
 Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */

//Input 1
/*
Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.
 */

//Input 2
/*Input: n = 1, bad = 1
Output: 1
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FirstBadVersion {

    static boolean[] booleans;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input :");
        int input = scanner.nextInt();
        firstBadVersion(input);
        booleans = new boolean[input];
       // isBadVersion(input);
        System.out.println(Arrays.toString(booleans));

    }

    public static void isBadVersion(int n){
        for (int i = 0; i < n; i++) {
           booleans[i] = new Random().nextBoolean();
        }
    }

    public static int firstBadVersion(int n){
        isBadVersion(n);

        int start=1,end=n;

        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(booleans[mid]==true)
                end=mid;
            else
                start=mid+1;
        }
        if(booleans[start]==true) return start;
        return -1;         }
    }

