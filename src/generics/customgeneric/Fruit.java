package src.generics.customgeneric;

public class Fruit implements Boxable{

    private String fruitName;
    private String fruitOrigin;
    private int price;
    private double weight;

    public Fruit(String fruitName, String fruitOrigin, int price, double weight) {
        this.fruitName = fruitName;
        this.fruitOrigin = fruitOrigin;
        this.price = price;
        this.weight = weight;
    }

    public String getFruitName() {
        return fruitName;
    }

    public String getFruitOrigin() {
        return fruitOrigin;
    }

    public int getPrice() {
        return price;
    }

    public double getWeight(){
        return weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitName='" + fruitName + '\'' +
                ", fruitOrigin='" + fruitOrigin + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
