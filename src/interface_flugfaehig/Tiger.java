package interface_flugfaehig;

public class Tiger {
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
}
