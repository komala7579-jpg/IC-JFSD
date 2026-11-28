import java.sql.*;
import java.util.*;

public class EmployeeDAO {
    Connection con;

    public EmployeeDAO(Connection con) {
        this.con=con;
    }

    public void addEmployee(Employee e) throws SQLException {
        String sql="INSERT INTO employees(emp_name,email,department,salary) VALUES(?,?,?,?)";
        try(PreparedStatement ps=con.prepareStatement(sql)) {
            ps.setString(1,e.empName);
            ps.setString(2,e.email);
            ps.setString(3,e.department);
            ps.setDouble(4,e.salary);
            ps.executeUpdate();
            System.out.println("Employee added successfully");
        }
    }

    public List<Employee> viewAll() throws SQLException {
        List<Employee> list=new ArrayList<>();
        String sql="SELECT * FROM employees";
        try(PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery()) {
            while(rs.next()) {
                list.add(new Employee(rs.getInt("emp_id"),rs.getString("emp_name"),rs.getString("email"),rs.getString("department"),rs.getDouble("salary")));
            }
        }
        return list;
    }

    public Employee searchEmployee(int id) throws SQLException {
        String sql="SELECT * FROM employees WHERE emp_id=?";
        try(PreparedStatement ps=con.prepareStatement(sql)) {
            ps.setInt(1,id);
            try(ResultSet rs=ps.executeQuery()) {
                if(rs.next()) {
                    return new Employee(rs.getInt("emp_id"),rs.getString("emp_name"),rs.getString("email"),rs.getString("department"),rs.getDouble("salary"));
                }
            }
        }
        return null;
    }

    public boolean updateDetails(int id,String name,String email,String dept) throws SQLException {
        String sql="UPDATE employees SET emp_name=?,email=?,department=? WHERE emp_id=?";
        try(PreparedStatement ps=con.prepareStatement(sql)) {
            ps.setString(1,name);
            ps.setString(2,email);
            ps.setString(3,dept);
            ps.setInt(4,id);
            return ps.executeUpdate()>0;
        }
    }

    public boolean updateSalary(int id,double salary) throws SQLException {
        String sql="UPDATE employees SET salary=? WHERE emp_id=?";
        try(PreparedStatement ps=con.prepareStatement(sql)) {
            ps.setDouble(1,salary);
            ps.setInt(2,id);
            return ps.executeUpdate()>0;
        }
    }

    public boolean deleteEmployee(int id) throws SQLException {
        String sql="DELETE FROM employees WHERE emp_id=?";
        try(PreparedStatement ps=con.prepareStatement(sql)) {
            ps.setInt(1,id);
            return ps.executeUpdate()>0;
        }
    }

    public List<Employee> byDepartment(String dept) throws SQLException {
        List<Employee> list=new ArrayList<>();
        String sql="SELECT * FROM employees WHERE department=?";
        try(PreparedStatement ps=con.prepareStatement(sql)) {
            ps.setString(1,dept);
            try(ResultSet rs=ps.executeQuery()) {
                while(rs.next()) {
                    list.add(new Employee(rs.getInt("emp_id"),rs.getString("emp_name"),rs.getString("email"),rs.getString("department"),rs.getDouble("salary")));
                }
            }
        }
        return list;
    }

    public Employee highestPaid() throws SQLException {
        String sql="SELECT * FROM employees ORDER BY salary DESC LIMIT 1";
        try(PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery()) {
            if(rs.next()) {
                return new Employee(rs.getInt("emp_id"),rs.getString("emp_name"),rs.getString("email"),rs.getString("department"),rs.getDouble("salary"));
            }
        }
        return null;
    }

    public double averageSalary() throws SQLException {
        String sql="SELECT AVG(salary) FROM employees";
        try(PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery()) {
            if(rs.next()) {
                return rs.getDouble(1);
            }
        }
        return 0;
    }
}