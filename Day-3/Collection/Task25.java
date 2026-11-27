import java.util.Scanner;
public class Task25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Payment amount:");
        String PaymentAccount=sc.nextLine();
        try{
            double amount=Double.parseDouble(PaymentAccount);
            System.out.println("Payment amount:"+amount);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid Payment amount");
        }
    }
    }
