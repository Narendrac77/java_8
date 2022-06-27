package src.threadsdemo;

public class MultiThreadDemo extends Thread{

    @Override
    public void run(){
        try{
            System.out.println("Thread " + Thread.currentThread().getId() + " Is Running");
        } catch (Exception e) {
            System.out.println("Exception caught");
        }

    }

}
