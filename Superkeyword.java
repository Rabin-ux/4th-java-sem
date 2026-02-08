class Parent {
    int value = 100;

    void show() {
        System.out.println("Parent class method");
    }
}

public class Superkeyword extends Parent {

    void display() {
        System.out.println("Parent variable using super: " + super.value);
        super.show();
    }

    public static void main(String[] args) {
        Superkeyword obj = new Superkeyword();
        obj.display();
    }
}
