package src.java8.lambda.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainPredicate {
    static List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    public static void main(String[] args) {

        //lambdas with statements
        CustomPredicate<Integer> input = (x) -> {
            boolean b = x % 2 == 0;
            System.out.println(x);
            return b;
        };

        // Traditional Approach
        Predicate<Integer> predicateInteger = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        // lambda Expression
        Predicate<Integer> validateInput = (x)->x % 2 ==0;


        //System.out.println(input.accept(8));
        //System.out.println(validateInput.test(9));
        System.out.println(predicateInteger.test(10));
    }


      /*  Predicate<Integer> integerPredicate = x -> x % 2 == 0;
        System.out.println(list.stream()
                .filter(integerPredicate)
                .reduce((x, y)-> x +y));
    }

    private static Predicate<Integer> getIntegerPredicate() {
        Predicate<Integer> integerPredicate = x -> x % 2 == 0;
        return integerPredicate;
    }*/
}
