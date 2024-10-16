package main;

public class Main {
    public static void main(String[] args) {
        PersonExtendedOutsidePackage person = new PersonExtendedOutsidePackage();
        person.vorname = "Oghogho";
        System.out.println(person);
    }
}
