import java.util.HashSet;

public class Task23 {
    public static void main(String[] args) {

        HashSet<Integer> event1 = new HashSet<>();
        HashSet<Integer> event2 = new HashSet<>();

        event1.add(101);
        event1.add(102);
        event1.add(103);
        event1.add(104);
        event1.add(105);
        event1.add(106);
        event1.add(107);

        System.out.println("Event 1 Registrations: " + event1);

        event1.add(108);
        event1.add(101);

        System.out.println("After Adding New Registration: " + event1);

        event1.remove(106);
        System.out.println("After Cancellation: " + event1);

        int searchId = 103;

        if (event1.contains(searchId)) {
            System.out.println("Student " + searchId + " is registered for Event 1");
        } else {
            System.out.println("Student " + searchId + " is not registered for Event 1");
        }

        System.out.println("Total Event 1 Registrations: " + event1.size());

        event2.add(102);
        event2.add(103);
        event2.add(105);
        event2.add(108);
        event2.add(109);
        event2.add(110);

        System.out.println("Event 2 Registrations: " + event2);

        HashSet<Integer> bothEvents = new HashSet<>(event1);
        bothEvents.retainAll(event2);

        System.out.println("Students Registered for Both Events: " + bothEvents);

        HashSet<Integer> allStudents = new HashSet<>(event1);
        allStudents.addAll(event2);

        System.out.println("All Unique Registered Students: " + allStudents);
        System.out.println("Total Unique Registrations: " + allStudents.size());
    }
}