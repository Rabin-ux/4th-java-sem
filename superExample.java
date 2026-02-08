class Parentclass {
    void display() {
        System.out.println("Parent class display method.");
    }
}
class child extends Parentclass{
    void show(){
        super.display();
        System.out.println("Child class method.");
    }
}

public class superExample{
    public static void main(String[] args) {
        child c = new child();
        c.show();
    }
}