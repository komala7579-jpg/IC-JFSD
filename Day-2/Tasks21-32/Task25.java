
public class Task25 {
    public static void main(String[] args) {
        PaymentGateway p1 = new Googlepay();
        PaymentGateway p2 = new Phonepe();

        p1.makepayment();
        p2.makepayment();
    }
}

interface PaymentGateway {
    void makepayment();
}

class Googlepay implements PaymentGateway {
    public void makepayment() {
        System.out.println("Payment completed using Google Pay");
    }
}

class Phonepe implements PaymentGateway {
    public void makepayment() {
        System.out.println("Payment completed using Phonepe");
    }
}
