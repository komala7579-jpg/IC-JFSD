import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> p=new ArrayList<>();
        ArrayList<Integer> q=new ArrayList<>();
        p.add("lipstick");
        q.add(2);
        p.add("eyelenar");
        q.add(4);
         p.add("kajal");
        q.add(6);
         p.add("foundation");
        q.add(9); 
        p.add("maskaara");
        q.add(4);
        System.out.println("arraylist of products:"+p);
        System.out.println("Array list of quantity:"+q);
        p.remove("foundation");
        System.out.println("product contaon foundation:"+p.contains("foundation"));
        System.out.println("total no of products :"+(p.size()));
        p.clear();
        q.clear();

    }
    
}
