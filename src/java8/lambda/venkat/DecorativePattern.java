package src.java8.lambda.venkat;

import java.util.function.Function;

public class DecorativePattern {

    public static void print(int n, String msg, Function<Integer, Integer> func){
        System.out.println(n + " " + msg + " : "+ func.apply(n));
    }

    public static void main(String[] args) {

        Function<Integer, Integer> inc = e -> e +1;

        print(5, "incremented", inc);
        print(10, "incremented", inc);

        Function<Integer, Integer>  doubled = e -> e * 2;

        print(5, "double", doubled);
        print(10, "double", doubled);

        Function<Integer, Integer>  incAnddoubled = e -> (e + 1) * 2;

        // Old approach
     //   print(5, "increment and double", incAnddoubled);
       // print(10, "increment and double", incAnddoubled);

        print(5, "increment and double", inc.andThen(doubled));
    }
}
