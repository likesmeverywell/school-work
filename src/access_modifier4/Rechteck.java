package access_modifier4;

public class Rechteck extends GeometrischeForm {
    private double laenge;
    private double breite;

//    public Rechteck(double laenge, double breite) {
//        setLaenge(laenge);
//        setBreite(breite);
//    }

    public double getLaenge(){
        return this.laenge;
    }

    public void setLaenge(double laenge){
        if (laenge <= 0){
            throw new IllegalArgumentException("Laenge must be greater than zero");
        }
        this.laenge = laenge;
    }

    public double getBreite(){
        return this.breite;
    }

    public void setBreite(double breite){
        if (laenge <= 0){
            throw new IllegalArgumentException("Breite must be greater than zero");
        }
        this.breite = breite;
    }

    @Override
    public double berechneFlaeche() {
        return this.getLaenge() * this.getBreite();
    }

    @Override
    public String toString() {
        return "Rechteck [laenge: " + getLaenge() + ", breite: " + getBreite() + "]";
    }

}
