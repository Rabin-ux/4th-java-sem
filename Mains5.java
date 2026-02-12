import java.util.ArrayList;
import java.util.List;

// 1. Employee Class
class Employee {
    private String employeeId;
    private String name;
    private String role;
    private double baseSalary;
    private double deduction = 0;

    public Employee(String employeeId, String name, String role, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        this.baseSalary = baseSalary;
    }

    // Salary Calculation using switch-case
    public double calculateSalary() {
        double totalSalary;
        
        switch (role.toLowerCase()) {
            case "manager":
                totalSalary = baseSalary + (baseSalary * 0.20); // 20% bonus
                break;
            case "developer":
                totalSalary = baseSalary + (baseSalary * 0.10); // 10% bonus
                break;
            case "designer":
                totalSalary = baseSalary + (baseSalary * 0.05); // 5% bonus
                break;
            case "intern":
                totalSalary = 1000.00; // Fixed salary
                break;
            default:
                totalSalary = baseSalary;
                System.out.println("Unknown role for " + name + ". Using base salary.");
        }
        
        return totalSalary - deduction;
    }

    public void applyDeduction(double amount) {
        this.deduction += amount;
    }

    public void displayEmployeeDetails() {
        System.out.printf("ID: %-5s | Name: %-10s | Role: %-10s | Final Salary: $%.2f\n", 
                    employeeId, name, role, calculateSalary());
    }

    public String getEmployeeId() {
        return employeeId;
    }
}

// 2. Payroll Class
class Payroll {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void calculateAllSalaries() {
        System.out.println("\n--- Monthly Payroll Report ---");
        for (Employee e : employees) {
            e.displayEmployeeDetails();
        }
    }

    public Employee findEmployeeById(String employeeId) {
        for (Employee e : employees) {
            if (e.getEmployeeId().equalsIgnoreCase(employeeId)) {
                return e;
            }
        }
        return null;
    }
}

// 3. Main Class (Matches Mains5.java exactly)
public class Mains5 {
    public static void main(String[] args) {
        Payroll payrollSystem = new Payroll();

        payrollSystem.addEmployee(new Employee("E001", "Alice", "Manager", 5000));
        payrollSystem.addEmployee(new Employee("E002", "Bob", "Developer", 4000));
        payrollSystem.addEmployee(new Employee("E003", "Charlie", "Intern", 0));
        payrollSystem.addEmployee(new Employee("E004", "Diana", "Designer", 3500));

        Employee bob = payrollSystem.findEmployeeById("E002");
        if (bob != null) {
            bob.applyDeduction(200.00);
        }
        payrollSystem.calculateAllSalaries();
    }
}