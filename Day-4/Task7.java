import java.util.HashSet;
public class Task7 {
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
        s.add(101);
        s.add(102);
        s.add(103);
        s.add(104);
        s.add(105);
        s.add(101);
        System.out.println("Student registration IDs:"+s);
        s.add(106);
        System.out.println("After adding new ID:"+s);
        s.remove(103);
        System.out.println("After removing ID:"+s);
        System.out.println("ID exists:"+s.contains(102));
        System.out.println("Total unique registrations:"+s.size());
    }
}