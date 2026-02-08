final class FinalDemo {

    final int VALUE = 43;

    final void display() {  
        System.out.println("Final variable value = " + VALUE);
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.display();
    }
}
