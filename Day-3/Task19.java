public class Task19 {
    public static void main(String[] args) {
        StudentNameProcessor s=new StudentNameProcessor();
        System.out.println("Original name:"+(s.fullname));
        System.out.println("Cleaned Name:"+(s.fullname.trim()));
        System.out.println("Uppercase:"+(s.fullname.toUpperCase()));
        System.out.println("Total number of characters"+(s.fullname.length()));
        System.out.println("Firstname using indexof:"+(s.fullname.indexOf(0,12)));
        System.out.println("Firstname using Substring:"+(s.fullname.substring(0,12)));
        System.out.println("lastname using substring:"+(s.fullname.substring(12,20)));
        System.out.println("name start with jala"+(s.fullname.startsWith("jala")));
        
    }
    
}
class StudentNameProcessor{
    String fullname=" Jalaripalli Komala ";
}
