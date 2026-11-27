import java.util.HashSet;
public class Task8 {
    public static void main(String[] args) {
        HashSet<String> p=new HashSet<>();
        p.add("Lipstick");
        p.add("Eyeliner");
        p.add("Kajal");
        p.add("Foundation");
        p.add("Mascara");
        System.out.println("Products:"+p);
        p.add("Blush");
        System.out.println("After adding new product:"+p);
        p.add("Kajal");
        System.out.println("After adding duplicate product:"+p);
        p.remove("Foundation");
        System.out.println("After removing discontinued product:"+p);
        System.out.println("Product exists:"+p.contains("Lipstick"));
        System.out.println("All unique products:"+p);
        System.out.println("Total unique products:"+p.size());
    }
}