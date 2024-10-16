package lammda_ausdrucke;

import java.util.ArrayList;
import java.util.function.Predicate;

public class LamdasAusdruke {
    public static void main(String[] args) {
        ArrayList<String> nachnamen = new ArrayList<>();
        nachnamen.add("Schmidt");
        nachnamen.add("Müller");
        nachnamen.add("Meier");
        nachnamen.add("Pütz");

        Predicate<String> p = (String b) -> { return b.contains("ü"); };

        System.out.println("Alle Nachnamen mit u: ");
        for (String str : nachnamen) {
            if (p.test(str) == true) {
                System.out.println(str);
            }
        }

        System.out.println("Alle Nachnamen ohne u: ");
        for (String str : nachnamen) {
            if (p.test(str) != true) {
                System.out.println(str);
            }
        }
        // Beispiel 1:(verkürzte Parameterliste ohne Datentyp)
        Predicate<String> p1 = (b) -> { return b.contains("ü"); };
        testPredicate(nachnamen, p1);

        // Beispiel 2: (ohne Datentyp UND ohne runde Klammern)
        Predicate<String> p2 = b -> { return b.contains("ü"); };
        testPredicate(nachnamen, p2);

        // Beispiel 3: (ohne Datentyp UND ohne runde Klammern UND verkürzter Rumpf)
        Predicate<String> p3 = b -> b.contains("ü");
        testPredicate(nachnamen, p3);

        ArrayList<String> nachname = new ArrayList<>();
        nachname.add("Schmidt");
        nachname.add("Müller");
        nachname.add("Meier");
        nachname.add("Pütz");
        nachname.add("Pütz");
        nachname.add("Simon-Meier");

        // Beispiel 4: (für Nachnamen mit 'm' als Anfangsbuchstaben)
        Predicate<String> p4 = b -> b.toLowerCase().startsWith("m");
        testPredicate(nachname, p4);

        System.out.println("Alle Nachnamen mit m: ");
        for (String str : nachname) {
            if (p4.test(str)) {
                System.out.println(str);
            }
        }
    }

    private static void testPredicate (ArrayList<String> nachnamen, Predicate <String> p){
        System.out.println("Nachnamen, die das Prädikat erfüllen:");
        for (String str : nachnamen) {
            if (p.test(str)) {
                System.out.println(str);
            }
        }

        System.out.println("Nachnamen, die das Prädikat nicht erfüllen:");
        for (String str : nachnamen) {
            if (!p.test(str)) {
                System.out.println(str);
            }
        }
    }
}
