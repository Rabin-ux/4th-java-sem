import java.util.ArrayList;
import java.util.List;

// 1. Student Class
class Student {
    private String name;
    private List<Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) return 0.0;
        double sum = 0;
        for (double grade : grades) sum += grade;
        return sum / grades.size();
    }

    public void displayStudentDetails() {
        System.out.println("Student: " + name + " | Average: " + String.format("%.2f", calculateAverage()));
    }

    public String getName() { return name; }
}

// 2. GradeManager Class
class GradeManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) { students.add(student); }

    public void displayAllStudents() {
        for (Student s : students) s.displayStudentDetails();
    }
}

// 3. The Main Class (Updated to match Mains2.java)
public class Mains2 { 
    public static void main(String[] args) {
        GradeManager gm = new GradeManager();
        
        Student s1 = new Student("Rohit");
        s1.addGrade(88.0);
        s1.addGrade(92.5);
        
        gm.addStudent(s1);
        gm.displayAllStudents();
    }
}