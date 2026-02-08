abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("This is an animal eating Food.");
    }
}

class dog extends Animal {
    void sound() {
        System.out.println("Dog barks.");
    }
}   
public class Abstractmethod {
    public static void main(String[] args) {
        Animal a = new dog();
        a.sound();
        a.eat();
    }
}
