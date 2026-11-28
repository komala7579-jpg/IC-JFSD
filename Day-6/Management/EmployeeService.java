import java.sql.*;
import java.util.*;

public class EmployeeService {
    EmployeeDAO dao;

    public EmployeeService(Connection con) {
        dao=new EmployeeDAO(con);
    }

    public void add(Employee e) throws SQLException {
        dao.addEmployee(e);
    }

    public List<Employee> view() throws SQLException {
        return dao.viewAll();
    }

    public Employee search(int id) throws SQLException {
        return dao.searchEmployee(id);
    }

    public boolean update(int id,String name,String email,String dept) throws SQLException {
        return dao.updateDetails(id,name,email,dept);
    }

    public boolean updateSalary(int id,double salary) throws SQLException {
        return dao.updateSalary(id,salary);
    }

    public boolean delete(int id) throws SQLException {
        return dao.deleteEmployee(id);
    }

    public List<Employee> department(String dept) throws SQLException {
        return dao.byDepartment(dept);
    }

    public Employee highestPaid() throws SQLException {
        return dao.highestPaid();
    }

    public double averageSalary() throws SQLException {
        return dao.averageSalary();
    }
}