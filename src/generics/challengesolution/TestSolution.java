package src.generics.challengesolution;

import java.util.List;

public class TestSolution {

    public static void main(String[] args) {
        List<Long> longList = List.of(12L, 1L, 45L, 12L, 89L, 123L, 876L);
        NumericalOperations<Long> numericalOperations = new NumericalOperations<>(longList);
        System.out.println(numericalOperations.sortNUmbers());
        System.out.println(numericalOperations.getmax());
    }
}
