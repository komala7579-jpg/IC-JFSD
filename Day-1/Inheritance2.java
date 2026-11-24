public class Inheritance2 {
    public static void main(String[] args){
        Person p=new Person();
        Employee e=new Employee();
        Manager m=new Manager();
        p.displayperson("susmitha");
        e.displayemployee(101);
        m.displayManager("AIDS");

    }
}
class Person{
    void displayperson(String name){
        System.out.println(name);

    }

}
class Employee extends Person{
    void displayemployee(int EmployeeID){
        System.out.println(EmployeeID);

    }

}
class Manager extends Employee{
    void displayManager(String deparment){
        System.out.println(deparment);
    }
}