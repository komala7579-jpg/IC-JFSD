
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        students.put(4, "Priya");
        students.put(2, "Komala");
        students.put(1, "Saran");
        students.put(3, "Ravi");

        System.out.println(students);
    }
}
