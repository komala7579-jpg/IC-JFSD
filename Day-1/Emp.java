public class Emp {
    public static void main(String[] args) {
        Developer d=new Developer();
        Tester t=new Tester();
        d.WriteCode();
        t.runtest();
        t.displayBasicInfo("komala",200000);
    }
    
}
class Employee{
    void displayBasicInfo(String name,double basesalary){
        System.out.println("basic Information: name"+name+   "salary"+basesalary);
    }
}
class Developer extends Employee{
    String ProgrammingLanguage="Java";
    void WriteCode(){
        System.out.println("Programming Language:"+ProgrammingLanguage);
    }
}
class Tester extends Employee{
    String testingTool="Vs code";
    void runtest(){
        System.out.println("Testing tool:"+testingTool);
    }
}
