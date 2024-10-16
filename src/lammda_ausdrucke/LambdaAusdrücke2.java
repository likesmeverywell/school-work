package lammda_ausdrucke;

import java.util.ArrayList;

public class LambdaAusdrücke2 {
    public static void main(String[] args) {
        ArrayList<String>vornamen = new ArrayList<>();
        vornamen.add("Jens");
        vornamen.add("Tim");
        vornamen.add("Kim");
        vornamen.add("Harry");

        vornamen.removeIf((String b) -> { return b.contains("T");});
        System.out.println(vornamen);

        ArrayList<String>vorname = new ArrayList<>();
        vorname.add("Jens");
        vorname.add("Tim");
        vorname.add("Kim");
        vorname.add("Harry");
        vorname.removeIf(b -> b.length() > 2 && b.charAt(2) != 'm');

        System.out.println(vorname);
    }
}
