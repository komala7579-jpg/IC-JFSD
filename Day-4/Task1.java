
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("komala");
        a.add("Bhuvana");
        a.add("Indhu");
        a.add("Susmitha");
        a.add("Sandya");
        a.add("Bhavya");
        a.add("Sravani");
        a.add("Srujana");
        a.add("Pavan");
        a.add("Seshu");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
         a.add(10, "Megha");
        System.out.println("After adding: " + a);
        a.remove("Seshu");
        System.out.println("After removing: " + a);
        a.set(6, "Bhavana");
        System.out.println("After updating: " + a);
        System.out.println("Contains Komala: " + a.contains("komala"));
        System.out.println("Total students: " + a.size());
    }
}
