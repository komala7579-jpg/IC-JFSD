
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter operator (+, -, *, /):");
        int operator = sc.next().charAt(0);
        switch(operator) {
            case '+':
                System.out.println("Sum of two numbers: " + (a+b));
                break;

            case '-':
                System.out.println("Difference between two numbers: " + (a-b));
                break;

            case '*':
                System.out.println("Multiplication of two numbers: " + (a*b));
                break;

            case '/':
                System.out.println("Division: " + (a/b));
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}
