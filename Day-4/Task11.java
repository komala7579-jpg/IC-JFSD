import java.util.LinkedHashSet;
public class Task11{
    public static void main(String[] args){
        LinkedHashSet<String> con=new LinkedHashSet<>();
        con.add("Komala");
        con.add("Pavan");
        con.add("VAishu");
        con.add("Sumanth");
        System.out.println("Insertion order"+con);
        con.remove("VAishu");
        System.out.println("contains Sumanth:"+(con.contains("sumanth")));

        

    }
    
}
