package Interface_Grosse;

import java.util.Random;

public class Auto implements Groesse {
    private int laenge;
    private int breite;

    public Auto(int laenge, int breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    @Override
    public int ermittleLaenge() {
        return laenge;
    }

    @Override
    public int ermittleBreite() {
        return breite;
    }
    @Override
    public int ermittleHoehe(){
        return (int)(Math.random() * (2100 - 800 + 1)) + 800;
    }
}

