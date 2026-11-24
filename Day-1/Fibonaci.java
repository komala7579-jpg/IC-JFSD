import java.util.Scanner;
public class Fibonaci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        // Factorial
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        System.out.println("Factorial = " + fact);
        // Fibonacci Series
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        sc.close();
    }
}