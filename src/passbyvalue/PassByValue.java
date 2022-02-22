package src.passbyvalue;

public class PassByValue {

    public static void main(String[] args) {
        Customer customer = new Customer("Narendra");
       int value = 5;
       calculate(value);
        System.out.println(value); // Prints only 5 pass variable by values
        customerName(customer);
        System.out.println(customer.getName());// Pass By value Prints CHinnakotla
        
        final Customer c;
        /*c = c.setName("Narendra");
        c = c.setName("Chinnakotla");*/
        c = new Customer("Narendra");
        c.setName("Chinnakotla");
        System.out.println(c.getName());
    }

    private static void customerName(Customer customer) {
        customer.setName("Chinnakotla");
    }

    public static void calculate(int calculateValue){
        calculateValue = calculateValue * 5;
        System.out.println(calculateValue); // prints 25
    }


}
