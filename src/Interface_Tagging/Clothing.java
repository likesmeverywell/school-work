package Interface_Tagging;

public class Clothing extends Product implements FreeShippingEligible{
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Clothing [name=" + getName() + ", price=" + getPrice() + "]";
    }
}
