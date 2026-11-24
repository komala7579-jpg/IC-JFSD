public class nheritance3 {
    public static void main(String[] args) {
        Android a=new Android();
        Iphone i=new Iphone();
        a.makecall(20);
        a.turnon();
        i.makecall(30);
        i.turnon();
        
    }
    
}
class Device{
    String Powersource="on";
    void turnon(){
        System.out.println("Device powered on");
    }

}
class Mobile extends Device{
    void makecall(double Screensize){
        System.out.println(Screensize);
    }

}
class Android extends Mobile{
    void openplaystore(){
        System.out.println("playstore");

    }

}
class Iphone extends Mobile{
void openappstore(){
    System.out.println("appstore");
}
}