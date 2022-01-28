package src.java8.lambda.predicate;

@FunctionalInterface
public interface CustomPredicate<T> {

    boolean accept(T t);
}
