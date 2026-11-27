class Task3 {
    public static void main(String[] args) {
        TextConverter tc=new TextConverter();
        System.out.println("original message:"+(tc.Message));
        System.out.println("Uppercase Message:"+(tc.Message.toUpperCase()));
        System.out.println("Lowercase Message:"+(tc.Message.toLowerCase()));
    }
    
}
class TextConverter{
    String Message="Welcome to Java Programming";
}