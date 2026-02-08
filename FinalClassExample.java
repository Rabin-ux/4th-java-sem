class Finalclass {
    void display() {
        System.out.println("This is a final class.");
    }
}

public final class FinalClassExample {
    public static void main(String[] args) {
        Finalclass obj = new Finalclass();
        obj.display();
    }
}