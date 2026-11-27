
public class Task11 {
    public static void main(String[] args) {
        FullTimeEmployee f = new FullTimeEmployee("Komala", 30000);

        f.Showname();
        f.calculateSalary();
    }
}

abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void Showname() {
        System.out.println("Employee: " + name);
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlysalary;

    FullTimeEmployee(String name, double monthlysalary) {
        super(name);
        this.monthlysalary = monthlysalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Monthly Salary: ₹" + monthlysalary);
    }
}
