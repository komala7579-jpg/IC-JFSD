import java.util.HashMap;
public class Task26 {
    public static void main(String[] args) {
        HashMap<Integer,Double> a=new HashMap<>();
        a.put(101,5000.0);
        a.put(102,10000.0);
        a.put(103,15000.0);
        a.put(104,20000.0);
        System.out.println("Bank accounts:"+a);
        int id=101;
        double deposit=2000;
        if(a.containsKey(id)){
            a.put(id,a.get(id)+deposit);
            System.out.println("After deposit:"+a.get(id));
        }
        else{
            System.out.println("Account not found");
        }
        double withdraw=1000;
        if(a.containsKey(id)){
            if(a.get(id)>=withdraw){
                a.put(id,a.get(id)-withdraw);
                System.out.println("After withdrawal:"+a.get(id));
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
        else{
            System.out.println("Account not found");
        }
        if(a.containsKey(id)){
            System.out.println("Account balance:"+a.get(id));
        }
        else{
            System.out.println("Account not found");
        }
        System.out.println("All account details:");
        for(int i:a.keySet()){
            System.out.println(i+" "+a.get(i));
        }
        double total=0;
        for(double i:a.values()){
            total=total+i;
        }
        System.out.println("Total balance:"+total);
    }
}