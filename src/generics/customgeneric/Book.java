package src.generics.customgeneric;

public class Book implements Boxable {

    private String bookName;
    private String author;
    private int price;
    private double weight;

   public Book(String bookName, String author, int price, double weight){
       this.bookName = bookName;
       this.author = author;
       this.price = price;
       this.weight = weight;
   }

   public String getBookName(){
       return bookName;
   }

   public String getAuthor(){
       return author;
   }

   public int getPrice(){
       return price;
   }

   public double getWeight(){
       return weight;
   }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
