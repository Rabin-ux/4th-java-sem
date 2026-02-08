class Animal {
    void eat() {
        System.out.println("This Animals are eating food.");
    }   
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
