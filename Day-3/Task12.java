public class Task12 {
    public static void main(String[] args) {
        FormValidator f=new FormValidator();
        if(f.name.isEmpty()){
            System.out.println("Name is Required");
        }
        else{
            System.out.println("name is successfully submitted");
        }
        if(f.name1.isEmpty()){
            System.out.println("Name is Required");
        }
        else{
            System.out.println("name is successfully submitted");
        }
    }
    
}
class FormValidator{
    String name="Komala";
    String name1="";
}
