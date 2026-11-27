public class Task5 {
    public static void main(String[] args) {
        Uservalidator u=new Uservalidator();
        if(u.username.equalsIgnoreCase(u.enteredusername)){
            System.out.println("valid username");
        }
    }
    
}
class Uservalidator{
    String username="Admin";
    String enteredusername="ADMIN";
}
