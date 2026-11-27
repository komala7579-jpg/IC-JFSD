public class Task9 {
    public static void main(String[] args){
        Dog d=new Dog();
        d.makesound();
        d.sleep();

    }
    
}
abstract class Animal{
    abstract void makesound();
    void sleep(){
        System.out.println("Animal is slepeeping");
    }

}
class Dog extends Animal{
    public void makesound(){
System.out.println("Dog barks: Woof! Woof!.");
    }
}