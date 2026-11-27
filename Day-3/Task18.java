public class Task18 {
    public static void main(String[] args) {
        EmailValidation e=new EmailValidation();
       if(e.email.isEmpty()&&e.email.contains("@")&&e.email.endsWith(".com")&&e.email.startsWith("Student")){
        System.out.println("Valid mail");
       }
       else{
        System.out.println("Invalid email");
       }
        if(e.email1.isEmpty()&&e.email1.contains("@")&&e.email1.endsWith(".com")&&e.email1.startsWith("Student")){
        System.out.println("Valid mail");
       }
       else{
        System.out.println("Invalid email");
       }
        if(e.email2.isEmpty()&&e.email2.contains("@")&&e.email2.endsWith(".com")&&e.email2.startsWith("Student")){
        System.out.println("Valid mail");
       }
       else{
        System.out.println("Invalid email");
       }
    }
    
}
class EmailValidation{
    String email="komala7579@gmail.com";
    String email1="";
    String email2="student@gmail.com";
}