public class Task9 {
    public static void main(String[] args){
        NameExtractor n=new NameExtractor();
        System.out.println(n.fullname.substring(0,4));
        System.out.println(n.fullname.substring(2,5));
        System.out.println(n.fullname.substring(5));


    }
    
}
class NameExtractor{
    String fullname="Komala";
}
