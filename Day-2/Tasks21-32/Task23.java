
public class Task23 {
    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment(5000);

        upi.showAmount();
        upi.processPayment();
    }
}

abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    void showAmount() {
        System.out.println("Payment Amount: ₹" + amount);
    }

    abstract void processPayment();
}

class UPIPayment extends Payment {

    UPIPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Payment processed successfully using UPI");
    }
}
