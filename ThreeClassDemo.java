class A {
    void show() {
        System.out.println("Class A: Instance method call");
    }
}

class B {
    static void display() {
        System.out.println("Class B: Static method call");
    }
}


class C {
    C() {
        System.out.println("Class C: Constructor call");
    }
}

public class ThreeClassDemo {
    public static void main(String[] args) {

        A objA = new A();
        objA.show();


        C objC = new C();
    }
}
