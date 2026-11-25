import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> tasks=new LinkedList<>();
        tasks.add("Learn java");
        tasks.add("Learn SQL");
        tasks.add("Learn React");
        tasks.addFirst("Stsrt Training");
        tasks.addLast("Build project");
        System.out.println(tasks);
        
        

    }
    
}
