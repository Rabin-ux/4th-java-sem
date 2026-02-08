abstract class Calculators {

    abstract void calculate(int a, int b);
}

class Addition extends Calculators {

    void calculate(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    public static void main(String[] args) {
        Calculators obj = new Addition();
        obj.calculate(10, 20);
    }
}
