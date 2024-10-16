package access_modifier4;

public class Main {
    public static void main(String[] args) {
        Rechteck rechteck = new Rechteck();
        rechteck.setLaenge(5);
        rechteck.setBreite(4);
        System.out.println(rechteck);

        double flaeche = rechteck.berechneFlaeche();
        System.out.println("Die Fläche des Rechtecks beträgt: " + flaeche);
    }
}
