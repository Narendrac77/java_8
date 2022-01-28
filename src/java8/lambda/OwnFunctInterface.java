package src.java8.lambda;

@FunctionalInterface
public interface OwnFunctInterface {

    void add();

       static void add2(){
        System.out.println(" Non Abstract  static Function  ");
    }

    default void add3(){
        System.out.println(" Non Abstract default Fuction ");
    }
}
