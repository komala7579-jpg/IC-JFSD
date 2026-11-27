import java.util.HashMap;

public class Task13 {
    public static void main(String[] args) {
         HashMap<String, Integer> a = new HashMap<>();
        a.put("Rahul", 85);
        a.put("Priya", 92);
        a.put("Kiran", 76);
        a.put("Arun", 88);
        a.put("Bhuvana", 95);
        a.put("Komala", 80);
        a.put("Indhu", 89);
        a.put("Bhavya", 78);
        a.put("Sravani", 90);
        a.put("Megha", 82);

        System.out.println("Student Records: " + a);
        a.put("Rahul", 95);
        System.out.println("After updating Rahul: " + a);
        System.out.println("Rahul Marks: " + a.get("Rahul"));
        System.out.println("Contains Priya: " + a.containsKey("Priya"));
        a.remove("Kiran");
        System.out.println("After removing Kiran: " + a);
        System.out.println("Student Names and Marks:");

        for (String name : a.keySet()) {
            System.out.println(name + " : " + a.get(name));
        }
        int total = 0;

        for (int mark : a.values()) {
            total = total + mark;
        }

        double average = (double) total / a.size();

        System.out.println("Total Students: " + a.size());
        System.out.println("Average Marks: " + average);
    }
}