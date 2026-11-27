import java.util.HashMap;

public class Task16 {
    public static void main(String[] args) {

        HashMap<String, String> a = new HashMap<>();

        a.put("Rahul", "9876543210");
        a.put("Priya", "9876501234");
        a.put("Kiran", "9876512345");
        a.put("Arun", "9876523456");
        a.put("Bhuvana", "9876534567");
        a.put("Komala", "9876545678");
        a.put("Indhu", "9876556789");
        a.put("Bhavya", "9876567890");
        a.put("Sravani", "9876578901");
        a.put("Megha", "9876589012");

        System.out.println("Contact Directory: " + a);

        a.put("Pooja", "9876590123");
        System.out.println("After Adding New Contact: " + a);

        a.put("Rahul", "9123456780");
        System.out.println("After Updating Rahul's Number: " + a);

        String searchName = "Priya";

        if (a.containsKey(searchName)) {
            System.out.println(searchName + " Phone Number: " + a.get(searchName));
        } else {
            System.out.println("Contact Not Found");
        }

        a.remove("Kiran");
        System.out.println("After Deleting Kiran: " + a);

        System.out.println("All Contacts:");

        for (String name : a.keySet()) {
            System.out.println(name + " : " + a.get(name));
        }

        String searchNumber = "9876501234";

        if (a.containsValue(searchNumber)) {
            System.out.println(searchNumber + " is already saved");
        } else {
            System.out.println(searchNumber + " is not saved");
        }
    }
}