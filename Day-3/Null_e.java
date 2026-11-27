public class Null_e {
    public static void main(String[] args) {
        String str=null;
        try{
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("Nullpointer exception");
        }
    }
    
}
