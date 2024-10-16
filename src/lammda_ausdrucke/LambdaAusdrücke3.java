package lammda_ausdrucke;

import java.util.ArrayList;
import java.util.function.Predicate;

public class LambdaAusdrücke3 {
    public static void main(String[] args) {
        ArrayList<Integer>list  = new ArrayList<>();
        list.add(100);
        list.add(7);
        list.add(50);
        list.add(17);
        list.add(10);
        list.add(5);
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 10 == 0;
            }
        });
        System.out.println(list);


        list.removeIf(b -> b % 10 == 0);
        System.out.println(list);


    }
}
