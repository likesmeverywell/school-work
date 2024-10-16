package Interface_lebenwesen;

public interface Flugfaehig {
    double MAX_SPEED = 42.0;

    void fliege();

    default double getFlugGeschwindigkeit() {
        return Math.random() * MAX_SPEED + 1;
    }
}
