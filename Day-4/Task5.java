import java.util.LinkedList;
public class Task5 {
    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList<>();
        l.add("https://google.com");
        l.add("https://chatgpt.com");
        l.add("https://shopping cart.com");
        l.add("https://gogle.photos.com");
        System.out.println(l);
        System.out.println("after removing recently visited website:"+(l.removeLast()));
        System.out.println("first visited:"+(l.getFirst()));
        System.out.println("last visited:"+(l.getLast()));
        System.out.println("it contains photos:"+(l.contains("https://gogle.photos.com")));
        l.clear();

    }
    
}
