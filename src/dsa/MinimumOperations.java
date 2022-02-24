package src.dsa;

/*
Given a number N. Find the minimum number of operations required to reach N starting from 0. You have 2 operations available:
        Double the number
        Add one to the number
*/
//Example 1
/*Input:
        N = 8
        Output: 4
        Explanation: 0 + 1 = 1, 1 + 1 = 2,
        2 * 2 = 4, 4 * 2 = 8*/
//Example 2
/*Input:
        N = 7
        Output: 5
        Explanation: 0 + 1 = 1, 1 + 1 = 2,
        1 + 2 = 3, 3 * 2 = 6, 6 + 1 = 7*/
public class MinimumOperations {

    public static void main(String[] args) {
        System.out.println(getMinimumOperations(5));
    }

    public static int getMinimumOperations(int n){
       /* int count = 0;
        while(n!= 0){
            if(n%2!=0 && n<1){
                count++;
                n-=1;
            }
            n = n/2;
            count++;
        }
        return count;*/
        int ans = 0;
        while(n > 0){
            n = (n % 2 == 1) ? n - 1 : n / 2;
            ans++;
        }
        return ans;
    }
}
