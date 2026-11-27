import java.util.ArrayList;
public class Task3 {
    public static void main(String[] args){
        ArrayList<String> a=new ArrayList<>();
        a.add("komala");
        a.add("Bhuvana");
        a.add("Indhu");
        a.add("Susmitha");
        a.add("Sandya");
        a.add("Bhavya");
        a.add("Sravani");
        a.add("Srujana");
        a.add("Pavan");
        a.add("Seshu");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
         a.add(10, "Megha");
        System.out.println("After adding newly present: " + a);
        a.remove("Seshu");
        System.out.println("after removing absenties:"+a);
        System.out.println("is komala is their:"+(a.contains("komala")));
        System.out.println("Total number of present employees:"+(a.size()));
        System.out.println("reverse order");
        for(int i=a.size()-1;i>=0;i--){
            System.out.println(a.get(i));
        }
    }
    
}
