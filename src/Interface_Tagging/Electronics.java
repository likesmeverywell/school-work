package Interface_Tagging;

public class Electronics extends Product implements FreeShippingEligible{
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Electronics [name=" + getName() + ", price=" + getPrice() + "]";
    }
}
