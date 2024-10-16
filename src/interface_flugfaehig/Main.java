package interface_flugfaehig;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        System.out.println("cinterface_flugfaehig.Interface_lebenwesen.Flugfaehig is abstract; cannot be instantiated");

        ArrayList<Flugfaehig> tiere = new ArrayList<>();

        Vogel vogel1 = new Vogel("Spatz");
        Vogel vogel2 = new Vogel("Adler");

        Tiger tiger1 = new Tiger("Leo");
        Tiger tiger2 = new Tiger("Toby");

        tiere.add(vogel1);
        tiere.add(vogel2);

        for (Flugfaehig tier  : tiere) {
            if (tier  instanceof Vogel) {
                ((Vogel) tier ).fliege();
                System.out.println("Geschwindigkeit: "
                        + ((Vogel) tier ).getFlugGeschwindigkeit());
            } else {
                System.out.println(tier.toString());
            }
        }
    }
}
