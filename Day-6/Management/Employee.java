public class Employee {
    int empId;
    String empName;
    String email;
    String department;
    double salary;

    public Employee(String empName,String email,String department,double salary) {
        this.empName=empName;
        this.email=email;
        this.department=department;
        this.salary=salary;
    }

    public Employee(int empId,String empName,String email,String department,double salary) {
        this.empId=empId;
        this.empName=empName;
        this.email=email;
        this.department=department;
        this.salary=salary;
    }
}