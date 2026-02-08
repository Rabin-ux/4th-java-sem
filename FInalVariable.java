class FinalVariableExample {
    final int MAX = 100;
        // Uncommenting the following line will cause a compilation error

void display(){
    System.out.println("Max values: " + MAX);
}

public static void main(String[] args) {
    FinalVariableExample obj = new FinalVariableExample();
    obj.display();
    }
}