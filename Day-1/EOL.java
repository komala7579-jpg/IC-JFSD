import java.util.Scanner;

public class EOL {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("the number is odd");
        }
        if((num%4==0&&num%100!=0)||(num%400==0)){
            System.out.println("The number is leap year");
        }  
    else{
        System.out.println("The number not a leap year");
    }  }

}
