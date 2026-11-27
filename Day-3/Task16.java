public class Task16 {
    public static void main(String[] args) {
        Studentdetails st=new Studentdetails();
       String []values=st.details.split(",");
       System.out.println("Name: " + values[0]);
        System.out.println("Age: " + values[1]);
        System.out.println("Course: " + values[2]);
        System.out.println("Marks: " + values[3]);
        
    }
    
}
class Studentdetails{
    String details="komala,12,python,53";
}