package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {

        List<Integer>inList = new ArrayList<>();
        inList.add(3);
        printList(inList);

//        List<Cat>catsList = new ArrayList<>();
//        inList.add(new Cat());
//        printList(catsList);
//        Printer<Cat> printer = new Printer<>();
//        printer.print();
//
//        Printer<Dog> doublePrinter = new Printer<>();
//        doublePrinter.print();
//
//        ArrayList<Cat> cats = new ArrayList<>();


//        shout("Omoregbe", 74);
//        shout(57);
//        shout(new Cat());
    }
    private static <T, V> T shout(T thingsToShout, V otherThingsToShout){
        System.out.println(thingsToShout + "!!!!");
        System.out.println(otherThingsToShout + "!!!!");

        return thingsToShout;
    }

    private static void printList(List<?> myList){
        System.out.println();
    }
}
