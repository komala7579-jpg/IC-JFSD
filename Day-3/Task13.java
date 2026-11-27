public class Task13 {
    public static void main(String[] args) {
        InputValidator i=new InputValidator();
        if(i.name.isBlank()){
            System.out.println("Invalid input");
        }
        else{
            System.out.println("Valid input");
        }
       if(i.name1.isBlank()){
            System.out.println("Invalid input");
        }
        else{
            System.out.println("Valid input");
        }
       if(i.name2.isBlank()){
            System.out.println("Invalid input");
        }
        else{
            System.out.println("Valid input");
        }
       
    }
    
}
class InputValidator{
    String name="Komala";
    String name1="";
    String name2=" ";

}
