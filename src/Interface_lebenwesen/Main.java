package Interface_lebenwesen;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lebewesen> lebewesenListe = new ArrayList<>();
        ArrayList<Flugfaehig> flugfaehigeListe = new ArrayList<>();

        Vogel vogel1 = new Vogel("Spatz");
        Vogel vogel2 = new Vogel("Adler");
        Tiger tiger1 = new Tiger("Leo");
        Tiger tiger2 = new Tiger("Toby");

        lebewesenListe.add(vogel1);
        lebewesenListe.add(vogel2);
        lebewesenListe.add(tiger1);
        lebewesenListe.add(tiger2);

        flugfaehigeListe.add(vogel1);
        flugfaehigeListe.add(vogel2);

        System.out.println("Lebewesen Liste:");
        for (Lebewesen lebewesen : lebewesenListe) {
            System.out.println(lebewesen);
            if (lebewesen instanceof Vogel) {
                ((Vogel) lebewesen).fliege();
                System.out.println("Fluggeschwindigkeit: "
                        + ((Vogel) lebewesen).getFlugGeschwindigkeit());
            }
        }

        System.out.println("\nFlugfähige Liste:");
        for (Flugfaehig flugfaehig : flugfaehigeListe) {
            System.out.println(flugfaehig);
            flugfaehig.fliege();
            System.out.println("Fluggeschwindigkeit: "
                    + flugfaehig.getFlugGeschwindigkeit());
        }
    }
}
