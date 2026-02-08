package mypack;

public class MyClass {
    public void show() {
        System.out.println("This is MyClass in mypack package.");
    }
}

import mypack.MyClass;

public class main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.show();
    }
}   