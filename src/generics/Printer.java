package generics;

import java.io.Serializable;

public class Printer<T, V> {
    T thingsToPrint;
    V otherThings;

    Printer(T thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }

    public void print(){
//        thingsToPrint.eat();
        System.out.println(thingsToPrint);
    }
}
