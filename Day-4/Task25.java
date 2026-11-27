import java.util.LinkedHashSet;
public class Task25 {
    public static void main(String[] args) {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Laptop");
        a.add("Mobile");
        a.add("Headphones");
        a.add("Smart Watch");
        a.add("Keyboard");
        a.add("Mouse");
        a.add("Tablet");
        a.add("Camera");
        a.add("Speaker");
        a.add("Monitor");
        System.out.println("Recently viewed products:"+a);
        a.add("Printer");
        a.add("Laptop");
        System.out.println("After adding products:"+a);
        System.out.println("Products in insertion order:");
        for(String i:a){
            System.out.println(i);
        }
        String search="Mobile";
        if(a.contains(search)){
            System.out.println(search+" was viewed");
        }
        else{
            System.out.println(search+" was not viewed");
        }
        a.remove("Camera");
        System.out.println("After removing camera:"+a);
        System.out.println("Total unique products:"+a.size());
    }
}