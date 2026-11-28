import java.sql.*;
import java.util.Scanner;


class App{
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/stu_db";
        String username="root";
        String password="Komala@2126";
        try{
        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println("Connected");
        Scanner sc=new Scanner(System.in);
        //String Query="INSERT INTO students VALUES(?,?,?,?)";
        //String Query="Update students set name=? where id=?";
        String Query="Delete from students where id=?";
        PreparedStatement ps=con.prepareStatement(Query);
      
      // String b=sc.nextLine();
        int a=sc.nextInt();
        //String c=sc.next();
        //int d=sc.nextInt();
       
        //ps.setString(1,b);
         ps.setInt(1,a);
        //ps.setString(3,c);
        //ps.setInt(4,d);
        ps.executeUpdate();

    }
    catch(Exception e){
        System.out.println("Error");
    }

    }
}