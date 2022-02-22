package src.passbyvalue;

public class Customer {

    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Customer(String name) {
        Name = name;
    }
}
