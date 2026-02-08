class Parent {
    final void display() {
        System.out.println("This is a final method in Parent class.");
    }  
}

class child extends Parent {
}

public class FinalMethod {
    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
}