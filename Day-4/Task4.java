import java.util.LinkedList;

public class Task4 {
    public static void main(String[] args) {

        LinkedList<String> a = new LinkedList<>();

        a.add("Kesariya");
        a.add("Samajavaragamana");
        a.add("Butta Bomma");
        a.add("Inkem Inkem");
        a.add("Srivalli");

        System.out.println("Music Playlist: " + a);

        a.addFirst("Aradhya");
        System.out.println("After adding at beginning: " + a);

        a.addLast("Oo Antava");
        System.out.println("After adding at end: " + a);

        a.remove("Butta Bomma");
        System.out.println("After removing Butta Bomma: " + a);

        a.removeFirst();
        System.out.println("After removing first song: " + a);

        a.removeLast();
        System.out.println("After removing last song: " + a);

        System.out.println("First song: " + a.getFirst());
        System.out.println("Last song: " + a.getLast());

        System.out.println("Contains Kesariya: " + a.contains("Kesariya"));

        System.out.println("Now playing: " + a.removeFirst());

        System.out.println("Playlist after playing: " + a);
    }
}