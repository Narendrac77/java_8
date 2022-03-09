package src.leetcode.challenges;

/*Given an array arr[] denoting heights of N towers and a positive integer K,
you have to modify the height of each tower either by increasing or decreasing them by K only once.
After modifying, height should be a non-negative integer.
Find out the minimum possible difference of the height of shortest and longest towers after you have modified each tower.
You can find a slight modification of the problem here.
Note: It is compulsory to increase or decrease (if possible) by K to each tower.*/

// Example 1
/* Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as
{3, 3, 6, 8}. The difference between
the largest and the smallest is 8-3 = 5.*/

//Example 2
/*Input:
K = 3, N = 5
Arr[] = {3, 9, 12, 16, 20}
Output:
11
Explanation:
The array can be modified as
{6, 12, 9, 13, 17}. The difference between
the largest and the smallest is 17-6 = 11*/

import java.util.Arrays;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MinimizeTheHeights {

    public static void main(String[] args) {

        int[] n = { 2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        int result = getMinDiff(n, n.length,5);
        System.out.println(result);
    }

    static int getMinDiff(int arr[], int n, int k) {
        // code here
        /*int min = arr[0];
        int max = arr[0];
        int result = 0;
        for(int i = 1; i < n;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max && arr[i]!= k){
                max = arr[i];
            }
        }
        result =-((min+k)-(max-k));
        return result;*/
        if(n==1)
        {
            return 0;
        }

        Arrays.sort(arr);

        int diff = arr[n-1] - arr[0];

        int max = 0,min = 0;

        for(int i = 1;i<n;i++)
        {
            if(arr[i]-k < 0)
            {

                continue;
            }

            max = Math.max(arr[i-1]+k,arr[n-1]-k);
            min = Math.min(arr[0]+k,arr[i]-k);

            diff = Math.min(diff,max-min);
        }
        System.out.println("min " + min + "max "+ max);

        return diff;
    }
}


/*
2, 6, 3, 4, 7, 2, 10, 3, 2, 1

7, 11, 8, 9, 12, 7, 5, 8, 7, 6

1, 5, 8, 10

3, 3, 6, 8

3, 9, 12, 16, 20

6, 6, 9, 13, 17
 */