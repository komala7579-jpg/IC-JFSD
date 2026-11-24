
public class Task26 {
    public static void main(String[] args) {

        Alert a1 = new EmailAlert();
        Alert a2 = new MobileAlert();

        a1.sendAlert("Your order has been confirmed");
        a2.sendAlert("Your account has been updated");
    }
}

interface Alert {
    void sendAlert(String message);
}

class EmailAlert implements Alert {

    @Override
    public void sendAlert(String message) {
        System.out.println("Email Alert: " + message);
    }
}

class MobileAlert implements Alert {

    @Override
    public void sendAlert(String message) {
        System.out.println("Mobile Alert: " + message);
    }
}
