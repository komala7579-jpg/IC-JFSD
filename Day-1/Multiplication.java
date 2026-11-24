import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=10;i++ ){
            int j=0;
            j=n*i;
            System.out.println(n+ "*" +i+ "=" +j);
        }
    }
    
}
