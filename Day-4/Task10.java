import java.util.TreeSet;

public class Task10 {
    public static void main(String[] args) {

        TreeSet<Integer> a = new TreeSet<>();

        a.add(85);
        a.add(92);
        a.add(76);
        a.add(88);
        a.add(95);
        a.add(70);
        a.add(82);
        a.add(90);
        a.add(78);
        a.add(85);

        System.out.println("Exam Scores: " + a);

        System.out.println("Unique Scores: " + a);

        System.out.println("Highest Score: " + a.last());

        System.out.println("Lowest Score: " + a.first());

        int score = 85;

        System.out.println("Next Higher Score of " + score + ": " + a.higher(score));

        System.out.println("Next Lower Score of " + score + ": " + a.lower(score));

        System.out.println("Scores in Descending Order: " + a.descendingSet());
    }
}