class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + this.name);
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {
        Student student = new Student("Rabin");
        student.display();
    }
}
