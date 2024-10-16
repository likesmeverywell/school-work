package Interface_lebenwesen;

public class Vogel extends Lebewesen {
    private String name;

    public Vogel(String name) {
        this.name = name;
    }

    @Override
    public void fliege() {
        System.out.println("Ich bin ein Vogel, " +
                "ich kann fliegen. " +
                "Meine maximale Geschwindigkeit beträgt " + MAX_SPEED);
    }

    @Override
    public double getFlugGeschwindigkeit() {
        return super.getFlugGeschwindigkeit();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vogel{" +
                "name='" + name + '\'' +
                '}';
    }
}
