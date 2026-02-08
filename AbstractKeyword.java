abstract class shape {
    abstract void draw();

    void message() {
        System.out.println("This is a shape class.");
    }
}

class Circle extends shape {
    void draw() {
        System.out.println("This is a Circle.");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        shape s = new Circle();
        s.draw();
        s.message();
    }
}