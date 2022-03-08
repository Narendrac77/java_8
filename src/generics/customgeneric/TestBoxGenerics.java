package src.generics.customgeneric;

public class TestBoxGenerics {

    public static void main(String[] args) {
        Box<Book> bookBox = new Box<>();
        bookBox.addItem(new Book("Java", "Narendra", 200, 150.00));
        bookBox.addItem(new Book("C","Puli", 50, 160.25));
        bookBox.addItem(new Book("Python","Balaji", 250, 170.00));
        bookBox.addItem(new Book("C++","Balaji Puli", 250, 130.75));
        System.out.println(bookBox.getLatestItem());
        System.out.println("Book Count "+ BoxUtils.getCountOfItems(bookBox));
        System.out.println(bookBox);
        System.out.println("Total weight of book box :" + bookBox.getTotalWeight());

        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addItem(new Fruit("Mango", "India", 100, 130.50));
        fruitBox.addItem(new Fruit("Apple", "Kashmir", 100, 150.75));
        System.out.println(fruitBox.getLatestItem());
        System.out.println("Fruit Count "+ BoxUtils.getCountOfItems(fruitBox));
        System.out.println("Total weight of Fruit box :" + fruitBox.getTotalWeight());
        System.out.println(fruitBox);
    }
}
