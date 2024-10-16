package Interface_Grosse;

public class Papierblatt implements Groesse {
    private String format;

    public Papierblatt(String format) {
        this.format = format;
    }

    @Override
    public int ermittleLaenge() {
        switch (format) {
            case "DIN A4":
                return 297;
            case "DIN A3":
                return 410;
            default:
                return -1;
        }
    }

    @Override
    public int ermittleBreite() {
        switch (format) {
            case "DIN A4":
                return 210;
            case "DIN A3":
                return 297;
            default:
                return -1;
        }
    }
}
