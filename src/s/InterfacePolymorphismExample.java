package s;

// Interface Animal
interface Animal {
    void sound();
}

// Dog class implementing Animal interface
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Cat class implementing Animal interface
class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class InterfacePolymorphismExample {
    public static void main(String[] args) {
        Animal dog = new Dog(); // Object of Dog class
        Animal cat = new Cat(); // Object of Cat class

        dog.sound(); // Calls Dog's implementation of sound(): "Dog barks"
        cat.sound(); // Calls Cat's implementation of sound(): "Cat meows"
    }
}
