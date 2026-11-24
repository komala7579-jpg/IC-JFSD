public class Oops {
    public static void main(String[] args)
    {
        Car c=new Car();
        c.getter();
        c.setter(1000);
        c.getter();


    }
}
class Car{
    private int speed=200;
    public void getter(){
        System.out.println(speed);
    }
    public void setter(int s){
        speed=s;
    }

}
