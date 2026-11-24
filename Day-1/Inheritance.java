
class Inheritance {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Tesla";
        c.modelname = "Model 5";
         c.honk();
        c.displayDetails();
    }
}
class Vehicle {
    String brand;
    void honk() {
        System.out.println("Beep! Beep!");
    }
}
class Car extends Vehicle {
    String modelname;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model Name: " + modelname);
    }
}
