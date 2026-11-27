import java.util.TreeSet;
public class Task24 {
    public static void main(String[] args) {
        TreeSet<String> tech=new TreeSet<>();
        tech.add("Java");
        tech.add("Python");
        tech.add("React");
        tech.add("SQL");
        System.out.println(tech);
        tech.add("MangoDB");
        System.out.println("after adding:"+tech);
        tech.remove("SQL");
        System.out.println("after removing:"+tech);
        System.out.println("it contains SQL"+tech.contains("python"));
        System.out.println("first"+tech.first());
        System.out.println("last"+tech.last());
        tech.descendingSet();
        System.out.println("alphabetic order"+tech);

    }
    
}
