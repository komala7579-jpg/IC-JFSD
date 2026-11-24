
public class Task22 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();

        sa.calculateInterest(3000);
        sa.displayAccountType();
    }
}

abstract class BankAccount {
    abstract double calculateInterest(double balance);

    void displayAccountType() {
        System.out.println("Bank Account Details");
    }
}

class SavingsAccount extends BankAccount {
    @Override
    double calculateInterest(double balance) {
        double interest = balance * 0.05;
        System.out.println("Interest: " + interest);
        return interest;
    }
}
