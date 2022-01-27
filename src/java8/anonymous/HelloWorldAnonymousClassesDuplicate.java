package src.java8.anonymous;

public class HelloWorldAnonymousClassesDuplicate {

    interface HelloWorld{
        void greet();
        void greetSomeOne(String message);
    }

    public void sayHello(){
        class EnglishGreeting implements HelloWorld{

            @Override
            public void greet() {
                greetSomeOne("World");
            }

            @Override
            public void greetSomeOne(String message) {
                System.out.println("Hello " + message);
            }
        }

        HelloWorld frenchGreeting = new HelloWorld() {
            @Override
            public void greet() {
             greetSomeOne("Greetig");
            }

            @Override
            public void greetSomeOne(String message) {
                System.out.println("French " + message);
            }
        };

        HelloWorld spanishGreeting = new HelloWorld() {
            @Override
            public void greet() {
                greetSomeOne("Greeting");
            }

            @Override
            public void greetSomeOne(String message) {
                System.out.println("Spanish " + message);
            }
        };

        HelloWorld englishGreeting = new EnglishGreeting();

        englishGreeting.greet();
        frenchGreeting.greetSomeOne("Greeting");
        spanishGreeting.greet();

    }

    public static void main(String[] args) {

        HelloWorldAnonymousClassesDuplicate helloWorldAnonymousClassesDuplicate = new HelloWorldAnonymousClassesDuplicate();
        helloWorldAnonymousClassesDuplicate.sayHello();
    }
}
