public class Task17 {
    public static void main(String[] args) {
        MessageBuilder m=new MessageBuilder();
        String fullname=m.firstname.concat(" ").concat(m.lastname);
        System.out.println("Welcome,"+(fullname));
        
    }
    
}
class MessageBuilder{
    String firstname="Jalaripalli";
    String lastname=" Komala";


}
