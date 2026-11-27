public class Task1 {
    public static void main(String[] args){
        String name="Komala";
        String frd="Komala";
        System.out.println("String length:"+(name.length()));
        System.out.println("UpperCase:"+(name.toUpperCase()));
        System.out.println("Lowercase:"+(name.toLowerCase()));
        System.out.println("Number of characters in a String:"+(name.length()));
        for(int i=0;i<(name.length());i++){
        System.out.println(name.charAt(i));
        }
         System.out.println(name.equals(frd));

    }
    
}
