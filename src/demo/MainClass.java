package src.demo;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Sample sample = new Sample("Giri", "ZPHS", "B-TCH");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String input = sc.nextLine();
        System.out.println(input);
        System.out.println(sample);
    }
}
