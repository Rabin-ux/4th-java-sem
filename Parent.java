public class Parent {
 void display() {
        System.out.println("parent's showing method.");
    }   
}
 class Child extends Parent {
    void display() {
        System.out.println("child's showing method.");
    }
    
    public class DynamicMethodDispatch {
        public static void main(String[] args) {
            Parent obj = new Child();
            obj.display();
        }
    }