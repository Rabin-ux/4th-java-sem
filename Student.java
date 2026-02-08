import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    long prn;

    Student(String n, int r, long p) {
        name = n;
        rollNo = r;
        prn = p;
    }

    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("PRN    : " + prn);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        System.out.print("Enter PRN: ");
        long prn = sc.nextLong();

        Student s = new Student(name, roll, prn);
        s.display();

        sc.close();
    }
}
