package Interface_Grosse;

public interface Groesse extends ErweiterteGroesse{
    int ermittleLaenge();

    int ermittleBreite();

    default int ermittleFlaeche() {
        return ermittleLaenge() * ermittleBreite();
    }
}