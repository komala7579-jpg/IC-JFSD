import java.sql.*;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url="jdbc:mysql://localhost:3306/registration";
        String username="root";
        String password="Komala@2126";
        return DriverManager.getConnection(url,username,password);
    }
}