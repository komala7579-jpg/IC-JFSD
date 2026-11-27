public class Task14 {
    public static void main(String[] args) {
        WebsiteValidator w=new WebsiteValidator();
        if(w.url.startsWith("https://")){
            System.out.println("Secure website URL");
        }
        else{
            System.out.println("Invalid website protocol");
        }
        if(w.url1.startsWith("https://")){
            System.out.println("Secure website URL");
        }
        else{
            System.out.println("Invalid website protocol");
        }
    }
    
}
class WebsiteValidator{
    String url="https://ssms.saranv.in/student/tasks";
    String url1="ssms.saranv.in/student/task";
   

}

