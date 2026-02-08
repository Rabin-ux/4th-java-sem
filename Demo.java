class Demo {
    int a, b;

    void setValues(int x, int y) {
        a = x;
        b = y;
    }

    void displaySum() {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.setValues(10, 20); 
        d.displaySum();
    }
}
