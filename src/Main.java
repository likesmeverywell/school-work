import Interface_Tagging.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("James hardly chase", 34);
        Electronics electronics = new Electronics("Smartphone", 200);
        Clothing clothing = new Clothing("T-Shirt", 20.0);

//        FreeShippingEligible electronics = new Electronics("Smartphone", 200);
//        FreeShippingEligible clothing = new Clothing("T-Shirt", 20.0);

        System.out.println(book);
        System.out.println(electronics);
        System.out.println(clothing);

        List<Product> productList = new ArrayList<>();
        productList.add(book);
        productList.add((Product) electronics);
        productList.add((Product) clothing);

        for (Product products : productList){
            String className = products.getClass().getSimpleName();
            String shippingStatus = (products instanceof FreeShippingEligible)
                    ? "kostenloser Versand" : "kostenpflichtiger Versand";
            System.out.println(className + " - " + shippingStatus + " für dieses Produkt: " + products);
        }

    }
}