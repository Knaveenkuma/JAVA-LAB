// Abstract Employee class
abstract class Employee {
    private String name;
    private int age;
    private double hourRate;

    public Employee(String name, int age, double hourRate) {
        this.name = name;
        this.age = age;
        this.hourRate = hourRate;
    }

    public abstract double calcSalary(double hours);

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nHourly Rate: $" + hourRate;
    }
}

// Manager class
class Manager extends Employee {
    public Manager(String name, int age, double hourRate) {
        super(name, age, hourRate);
    }

    @Override
    public double calcSalary(double hours) {
        return hours *getHourRate();
    }
}

// Clerk class
class Clerk extends Employee {
    public Clerk(String name, int age, double hourRate) {
        super(name, age, hourRate);
    }

    @Override
    public double calcSalary(double hours) {
        return hours * getHourRate();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Manager objects
        Manager manager1 = new Manager("Yashoanandan", 35, 25.0);
        Manager manager2 = new Manager("Sri Krishna", 42, 30.0);

        // Create Clerk object
        Clerk clerk1 = new Clerk("Sita Ram", 28, 15.0);

        // Calculate and display salaries
        double manager1Salary = manager1.calcSalary(40); // Assuming 40 hours worked
        double manager2Salary = manager2.calcSalary(45); // Assuming 45 hours worked
        double clerk1Salary = clerk1.calcSalary(35);     // Assuming 35 hours worked

        System.out.println("Manager 1 Details:\n" + manager1);
        System.out.println("Salary: S" + manager1Salary + "\n");

        System.out.println("Manager 2 Details:\n" + manager2);
        System.out.println("Salary: S" + manager2Salary + "\n");

        System.out.println("Clerk 1 Details:\n" + clerk1);
        System.out.println("Salary: $" + clerk1Salary);
    }
}

