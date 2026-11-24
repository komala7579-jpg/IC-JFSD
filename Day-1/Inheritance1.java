
public class Inheritance1 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        Circle c = new Circle();

        r.displayColor();
        r.calculateArea();

        c.displayColor();
        c.calculateArea();
    }
}

class Shape {
    String color = "pink";

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Rectangle extends Shape {
    int length = 4;
    int width = 6;

    void calculateArea() {
        System.out.println("Area of rectangle: " + (length * width));
    }
}

class Circle extends Shape {
    int r = 4;

    void calculateArea() {
        System.out.println("Area of circle: " + (3.14 * r * r));
    }
}
