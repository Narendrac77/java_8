package src.leetcode.challenges;

import java.util.Scanner;

/* Before implementing any algorithm, we should be thorough with taking inputs.
Here, we will learn how to read inputs.
You are given five inputs: a(integer), b(float ), c(long), d(byte), s(string) respectively.
You need to take the input and print a, b, c, d and s in new line.
 */
//Example :1
/*Input:
5
2.5
6546854
120
geek for geeks

Output:
5
2.5
6546854
120
geek for geeks*/
public class InputProblems {
    public static void main(String[] args) {
        IOFunction();
    }


    static void IOFunction() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            System.out.println(a);
            float b = sc.nextFloat();
            System.out.println(b);
            long c = sc.nextLong();
            System.out.println(c);
            byte d = sc.nextByte();
            System.out.println(d);
            sc.nextLine();
            String e = sc.nextLine();
            System.out.println(e);
        }
    }
}
