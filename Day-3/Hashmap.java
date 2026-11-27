
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Saran");
        students.put(2, "Komala");
        students.put(3, "Ravi");
        students.put(4, "Priya");

        System.out.println(students);
        System.out.println("Student 1:"+students.get(1));
        students.put(2,"Yogeswari");
        System.out.println("updated map"+students);
    }
}
