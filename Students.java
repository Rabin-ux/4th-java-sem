import java.util.Scanner;

class Students {
    int rollNo;
    String name;
    long prn;

    static String collegeName = "Symbiosis Institute of Technology,Pune";

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        name = sc.nextLine();

        System.out.print("Enter yourRoll No: ");
        rollNo = sc.nextInt();

        System.out.print("Enter your PRN: ");
        prn = sc.nextLong();
    }

    void display() {
        System.out.println("\n--- Students Details ---");
        System.out.println("Name        : " + name);
        System.out.println("Roll No     : " + rollNo);
        System.out.println("PRN         : " + prn);
        System.out.println("College Name: " + collegeName);
    }

    public static void main(String[] args) {
        Students s = new Students();
        s.accept();
        s.display();
    }
}
