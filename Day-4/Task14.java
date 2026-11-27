import java.util.HashMap;
public class Task14 {
    public static void main(String[] args) {
        HashMap<Integer,Double> a=new HashMap<>();
        a.put(101,25000.0);
        a.put(102,30000.0);
        a.put(103,28000.0);
        a.put(104,35000.0);
        a.put(105,40000.0);
        a.put(106,32000.0);
        a.put(107,27000.0);
        a.put(108,45000.0);
        a.put(109,38000.0);
        a.put(110,42000.0);
        System.out.println("Employee details:"+a);
        a.put(103,32000.0);
        System.out.println("After updating:"+a);
        System.out.println("Search employee:"+a.get(105));
        System.out.println("All employee salaries:");
        for(int i:a.keySet()){
            System.out.println(i+" "+a.get(i));
        }
        double max=0;
        int id=0;
        double total=0;
        for(int i:a.keySet()){
            if(a.get(i)>max){
                max=a.get(i);
                id=i;
            }
            total=total+a.get(i);
        }
        System.out.println("Highest salary employee:"+id);
        System.out.println("Highest salary:"+max);
        System.out.println("Total salary:"+total);
    }
}