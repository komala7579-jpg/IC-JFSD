import java.util.TreeSet;
public class Task9 {
    public static void main(String[] args) {
        TreeSet<Integer> id=new TreeSet<>();
        id.add(101);
         id.add(109);
          id.add(106);
           id.add(141);
            id.add(108);
             id.add(141);
             System.out.println(id);
             id.add(120);
               System.out.println("after adding:"+id);
               id.remove(106);
               System.out.println("after removing:"+id);
               System.out.println("Smallest ID:"+(id.first()));
               System.out.println("Largest ID:"+(id.last()));
               int id1=106;
               System.out.println("Next higher ID of "+id+":"+id.higher(id1));
               System.out.println("Next Lower ID of "+id+":"+id.lower(id1));
               System.out.println("Above  IDs of "+id+":"+id.tailSet(id1));
                System.out.println("lower IDs of "+id+":"+id.headSet(id1));
                System.out.println("ids between 106 and 150:"+id.subSet(106, 150));
    }
    
}
