
public class Bank {
    public static void main(String[] args) {
        Account a = new Account();

        a.getter();

        a.deposit(200);
        a.withdraw(100);

        a.getter();
    }
}

class Account {
    private String accountholdername = "Komala";
    private double balance = 500;

    public void getter() {
        System.out.println("Account Holder: " + accountholdername);
        System.out.println("Balance: " + balance);
    }

    public void setter(int b) {
        if (b > 0) {
            balance = b;
        } else {
            System.out.println("Invalid balance");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println(" invalid amount");
        }
    }
}
