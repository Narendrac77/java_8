package src.ira;

public class Moisturizer {

    private int moisturizerId;
    private String moisturizername;
    private int price;
    private String name;

    public int getMoisturizerId() {
        return moisturizerId;
    }

    public void setMoisturizerId(int moisturizerId) {
        this.moisturizerId = moisturizerId;
    }

    public String getMoisturizername() {
        return moisturizername;
    }

    public void setMoisturizername(String moisturizername) {
        this.moisturizername = moisturizername;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Moisturizer(int moisturizerId, String moisturizername, int price, String name) {
        this.moisturizerId = moisturizerId;
        this.moisturizername = moisturizername;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Moisturizer{" +
                "moisturizerId=" + moisturizerId +
                ", moisturizername='" + moisturizername + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
