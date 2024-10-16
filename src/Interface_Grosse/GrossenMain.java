package Interface_Grosse;

import java.util.ArrayList;
import java.util.List;

public class GrossenMain {
    public static void main(String[] args) {
        List<Groesse> groessen = new ArrayList<>();
        groessen.add(new Auto(4000, 2000));
        groessen.add(new Auto(4500, 2200));
        groessen.add(new FussballPlatz());
        groessen.add(new FussballPlatz());
        groessen.add(new Papierblatt("DIN A4"));
        groessen.add(new Papierblatt("DIN A3"));

        for (Groesse groesse : groessen) {
            int laenge = groesse.ermittleLaenge();
            int breite = groesse.ermittleBreite();
            long flaeche = (long) laenge * breite;

            String typeName = groesse.getClass().getSimpleName();
            String output = typeName + " Länge: " + laenge + ", Breite: " + breite;
            int hoehe = ((ErweiterteGroesse) groesse).ermittleHoehe();
            output += ", Höhe: " + hoehe;
            output += ", Fläche: " + flaeche;

            System.out.println(output);
        }
    }
}
