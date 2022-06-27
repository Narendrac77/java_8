package src.threadsdemo;

public class ThreadMain {

    public static void main(String[] args) {
        MultiThreadDemo multiThreadDemo = new MultiThreadDemo();
        multiThreadDemo.run();
        for(int i = 0; i < 2 ;i++){
           // multiThreadDemo.run();

         //   multiThreadDemo.start();
        }
    }
}
