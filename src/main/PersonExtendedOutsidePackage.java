package main;

import edu.gfn.modifiers.Person;

public class PersonExtendedOutsidePackage extends Person {

    public String toString(){
        return "PersonExtendedOutsidePackage [vorname=" + vorname + "]";
    }
}
