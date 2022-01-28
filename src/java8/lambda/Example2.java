package src.java8.lambda;

public class Example2 {

    public static void main(String[] args) {
      /*  OwnFunctInterface ownFunctInterface = new OwnFunctInterface() {
            @Override
            public void add() {
                System.out.println(" Abstarct Method called ");
            }
        };*/


        OwnFunctInterface example2 = () -> System.out.println(" Abstarct Method called ");
        example2.add();
        example2.add3();
         OwnFunctInterface.add2();


    }

    }



