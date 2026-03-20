class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        // Base Salary + 5% Bonus
        return baseSalary + (5.0 / 100.0) * baseSalary;
    }
}

class Manager extends Employee {
    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        // Employee Salary + $2000 fixed bonus
        return super.calculateSalary() + 2000;
    }
}

class Executive extends Manager {
    Executive(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        // Manager Salary + 10% Executive bonus
        return super.calculateSalary() + (10.0 / 100.0) * baseSalary;
    }
}

// The class name starts with a Capital 'M' to match your filename
public class Multi_tier_payroll_system {
    public static void main(String[] args) {
        
        Employee a = new Employee("Alice", 10000.0);
        Manager b = new Manager("Bob", 10000.0);
        Executive c = new Executive("Charlie", 10000.0);

        System.out.println("--- Payroll Summary ---");
        System.out.println("Employee (" + a.name + "): $" + String.format("%.2f", a.calculateSalary()));
        System.out.println("Manager  (" + b.name + "): $" + String.format("%.2f", b.calculateSalary()));
        System.out.println("Executive(" + c.name + "): $" + String.format("%.2f", c.calculateSalary()));
    }
}