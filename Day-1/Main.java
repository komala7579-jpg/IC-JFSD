 class Student {
    private String name="Komala";
    private int rollno=3044;
    public void getter(){
        System.out.println(name);
        System.out.println(rollno);
    }
    public void setter(String name1 ,int rollno1){
        name=name1;
        rollno=rollno1;

    }
   
    
}
 public class Main{
    public static void main(String[] args){
        Student st=new Student();
        st.getter();
        st.setter("Komala",3044);
        st.getter();

    }
}
