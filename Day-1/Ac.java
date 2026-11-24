public class Ac{
    public static void main(String[] aStrings){
        FixedDepositAccount f=new FixedDepositAccount();
        f.showFDdetails(3);
    }
}
class Account{
    int Accountnumber=1234567890;
    void showAccount(){
        System.out.println("Account Number:"+Accountnumber);
    }
}
class SavingsAccount extends Account{
    void showSavingsDetail( double interestrate){
        System.out.println("Interest rate:"+interestrate);
    }
}
class FixedDepositAccount extends SavingsAccount{
    void showFDdetails(int lockinyears){
        System.out.println("Fixed deposit in years:"+lockinyears);

    }
}