class Person {
    String name = "Parent Name";

    Person() {
        System.out.println("Parent class constructor");
    }
}

public class Studentsthisandsuper extends Person {
    String name = "Child Name";

    Studentsthisandsuper() {
        super();
        System.out.println("Child class constructor");
    }

    void display() {
        System.out.println("Using this keyword  : " + this.name);
        System.out.println("Using super keyword : " + super.name);
    }

    public static void main(String[] args) {
        Studentsthisandsuper s = new Studentsthisandsuper();
        s.display();
    }
}
