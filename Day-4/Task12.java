import java.util.LinkedHashSet;

public class Task12 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> id=new LinkedHashSet<>();
        id.add(101);
        id.add(104);
        id.add(103);
        id.add(102);
        id.add(105);
        id.add(108);
        id.add(107);
        id.add(106);
        System.out.println(id);
        id.add(106);
        System.out.println("after adding:"+id);
        id.remove(105);
        System.out.println("after removing:"+id);
        System.out.println("Contain visitor 103:"+id.contains(103));
        System.out.println("Total Unique visitors:"+id.size());
        System.out.println("Visitor arrival order:"+id);

    }
    
}
