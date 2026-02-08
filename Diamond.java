interface A {
    void show();
}

interface B {
    void show();
}

class Diamond implements A, B {

    public void show() {
        System.out.println("Diamond problem solved using interface");
    }

    public static void main(String[] args) {
        Diamond obj = new Diamond();
        obj.show();
    }
}
