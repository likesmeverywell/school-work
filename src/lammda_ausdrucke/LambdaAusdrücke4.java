package lammda_ausdrucke;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaAusdrücke4 {
    public static void main(String[] args) {
        ArrayList<Student> studenten = new ArrayList<>();

        studenten.add(new Student("Jens",22));
        studenten.add(new Student("Hans",38));
        studenten.add(new Student("Kim",13));
        studenten.add(new Student("Tim",28));
        studenten.add(new Student("Fritz",44));


        Predicate<Student> student = students -> students.alter <= 18 || !students.name.contains("i");
        studenten.removeIf( student);

        System.out.println("\n" + studenten.toString());



    }
}
