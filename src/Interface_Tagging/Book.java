package Interface_Tagging;

public class Book extends Product {
    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Book [name=" + getName() + ", price=" + getPrice() + "]";
    }
}
