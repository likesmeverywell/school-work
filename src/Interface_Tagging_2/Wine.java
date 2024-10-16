package Interface_Tagging_2;

public class Wine extends Product implements AgeVerifiable, FreeShoppingEligible{
    public Wine(String name, double price) {
        super(name, price);
    }
}
