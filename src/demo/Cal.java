package src.demo;

public class Cal {

    public static void main(String[] args) {
        Cal cal = new Cal();
        cal.test1();
        cal.test2();
        cal.test3();
        cal.test4();
        cal.test5();
        cal.test6();
        cal.test7();

    }

    public void test1(){
        midValue(2,8);
    }

    public void test2(){
        midValue(3,9);
    }

    public void test3(){
        midValue(5,7);
    }

    public void test4(){
        midValue(1,1);
    }

    public void test5(){
        midValue(1,3);
    }

    public void test6(){
        midValue(3,5);
    }

    public void test7(){
        midValue(6,11);
    }


    public static void midValue(int a, int b){
        int mid1 = (a+b)/2;
        int mid2 = a + (b-a)/2;
        System.out.println("Step1 = " + mid1);
        System.out.println("Step2 = " + mid2);

    }
}
