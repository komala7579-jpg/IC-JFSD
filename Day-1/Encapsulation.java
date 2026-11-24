
public class Encapsulation {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getter();
        r.setter(2, 3);
        r.getter();
        r.calculateArea();
        r.calculatePerimeter();
    }
}

class Rectangle {
    private double length = 20;
    private double width = 10;

    public void getter() {
        if (length > 0 && width > 0) {
            System.out.println("Length: " + length);
            System.out.println("Width: " + width);
        }
    }

    public void setter(double l1, double w1) {
        if (l1 > 0 && w1 > 0) {
            length = l1;
            width = w1;
        } else {
            System.out.println("Invalid dimensions");
        }
    }

    public void calculateArea() {
        double area = length * width;
        System.out.println("Area: " + area);
    }

    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter: " + perimeter);
    }
}
