public class Task4 {
    public static void main(String[] args) {
        PasswordChecker pc=new PasswordChecker();
        System.out.println(pc.password.equals(pc.confirmpassword));
        System.out.println(pc.password.equals(pc.pass1));

        
    }
    
}
class PasswordChecker{
    String password="Java@123";
    String confirmpassword="Java@123";
    String pass1="Komala";
}