package src.java8;

public class LambdaExample {

    private static final String HELLO = "Hello World!";

    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = () -> System.out.println(HELLO);

        Thread t = new Thread(runnable);
        t.start();
        t.join();

        Runnable r = () -> System.out.println(HELLO);
        Thread t2 = new Thread(r);
        t2.start();
        t2.join();
    }


}
