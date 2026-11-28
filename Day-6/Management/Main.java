import java.sql.*;
import java.util.*;

public class Main {
    static Scanner sc=new Scanner(System.in);

    static int readInt(String message) {
        while(true) {
            try {
                System.out.print(message);
                return Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Enter a valid integer");
            }
        }
    }

    static double readDouble(String message) {
        while(true) {
            try {
                System.out.print(message);
                return Double.parseDouble(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Enter a valid number");
            }
        }
    }

    static String readText(String message) {
        while(true) {
            System.out.print(message);
            String value=sc.nextLine().trim();
            if(!value.isEmpty()) return value;
            System.out.println("This field cannot be empty");
        }
    }

    static void display(Employee e) {
        System.out.println("ID: "+e.empId);
        System.out.println("Name: "+e.empName);
        System.out.println("Email: "+e.email);
        System.out.println("Department: "+e.department);
        System.out.println("Salary: "+e.salary);
        System.out.println("-------------------------");
    }

    static void displayAll(List<Employee> list) {
        if(list.isEmpty()) {
            System.out.println("No employees found");
        } else {
            for(Employee e:list) display(e);
        }
    }

    public static void main(String[] args) {
        try(Connection con=DBConnection.getConnection()) {
            EmployeeService service=new EmployeeService(con);
            System.out.println("Database connected successfully");

            int choice;
            do {
                System.out.println("\n========== EMPLOYEE MANAGEMENT SYSTEM ==========");
                System.out.println("1. Add Employee");
                System.out.println("2. View All Employees");
                System.out.println("3. Search Employee");
                System.out.println("4. Update Employee Details");
                System.out.println("5. Update Employee Salary");
                System.out.println("6. Delete Employee");
                System.out.println("7. Display Employees by Department");
                System.out.println("8. Display Highest Paid Employee");
                System.out.println("9. Display Average Salary");
                System.out.println("10. Exit");

                choice=readInt("Enter Your Choice: ");

                switch(choice) {
                    case 1:
                        String name=readText("Enter Name: ");
                        String email=readText("Enter Email: ");
                        String dept=readText("Enter Department: ");
                        double salary=readDouble("Enter Salary: ");
                        if(salary<0) {
                            System.out.println("Salary cannot be negative");
                            break;
                        }
                        service.add(new Employee(name,email,dept,salary));
                        break;

                    case 2:
                        displayAll(service.view());
                        break;

                    case 3:
                        int id=readInt("Enter Employee ID: ");
                        Employee e=service.search(id);
                        if(e!=null) display(e);
                        else System.out.println("Employee not found");
                        break;

                    case 4:
                        int uid=readInt("Enter Employee ID: ");
                        if(service.search(uid)==null) {
                            System.out.println("Employee not found");
                            break;
                        }
                        String uname=readText("Enter New Name: ");
                        String uemail=readText("Enter New Email: ");
                        String udept=readText("Enter New Department: ");
                        if(service.update(uid,uname,uemail,udept))
                            System.out.println("Employee details updated");
                        else
                            System.out.println("Update failed");
                        break;

                    case 5:
                        int sid=readInt("Enter Employee ID: ");
                        double newsalary=readDouble("Enter New Salary: ");
                        if(newsalary<0) {
                            System.out.println("Salary cannot be negative");
                            break;
                        }
                        if(service.updateSalary(sid,newsalary))
                            System.out.println("Salary updated successfully");
                        else
                            System.out.println("Employee not found");
                        break;

                    case 6:
                        int did=readInt("Enter Employee ID: ");
                        if(service.delete(did))
                            System.out.println("Employee deleted successfully");
                        else
                            System.out.println("Employee not found");
                        break;

                    case 7:
                        String department=readText("Enter Department: ");
                        displayAll(service.department(department));
                        break;

                    case 8:
                        Employee high=service.highestPaid();
                        if(high!=null) display(high);
                        else System.out.println("No employees found");
                        break;

                    case 9:
                        if(service.view().isEmpty())
                            System.out.println("No employees found");
                        else
                            System.out.println("Average Salary: "+service.averageSalary());
                        break;

                    case 10:
                        System.out.println("Exiting Employee Management System");
                        break;

                    default:
                        System.out.println("Invalid choice. Enter 1 to 10");
                }
            } while(choice!=10);

        } catch(SQLException e) {
            System.out.println("Database Error: "+e.getMessage());
        }
        sc.close();
    }
}