import java.util.ArrayList;
import java.util.Collections;
public class Task6 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(2);
         a.add(56);
          a.add(56);
           a.add(47);
            a.add(90);
             a.add(89);
              a.add(67);
               a.add(44);
                a.add(69);
                 a.add(78);
                  a.add(4);
                  System.out.println(a);
                  a.set(2,600);
                  System.out.println("after updating:"+a);
                  System.out.println("Maxprice:"+(Collections.max(a)));
                 System.out.println("minprice:"+( Collections.min(a)));
                 Collections.sort(a);
                 System.out.println("ascending order:"+a);
                 System.out.println("price between range");
                 for (int i = 0; i < a.size(); i++) {
            if (a.get(i) >= 50 && a.get(i) <= 100) {
                System.out.println(a.get(i));
            }
        }
                   
    }
    
}
