package Interface_lebenwesen;

public class Tiger extends Lebewesen {
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void fliege() {

    }

    @Override
    public double getFlugGeschwindigkeit() {
        return super.getFlugGeschwindigkeit();
    }
}
