import java.util.HashMap;
import java.util.Map;

public class Task15 {
    public static void main(String[] args) {

        HashMap<Integer, Integer> a = new HashMap<>();

        a.put(101, 10);
        a.put(102, 3);
        a.put(103, 8);
        a.put(104, 0);
        a.put(105, 15);
        a.put(106, 2);
        a.put(107, 6);
        a.put(108, 4);
        a.put(109, 12);
        a.put(110, 0);

        System.out.println("Product Inventory: " + a);

        a.put(111, 20);
        System.out.println("After Adding New Product: " + a);

        a.put(102, 7);
        System.out.println("After Updating Product 102: " + a);

        int productId = 101;
        int soldQuantity = 3;

        int quantity = a.getOrDefault(productId, 0);

        if (quantity >= soldQuantity) {
            a.put(productId, quantity - soldQuantity);
            System.out.println("Product Sold Successfully");
        } else {
            System.out.println("Insufficient Stock");
        }

        int searchId = 105;

        if (a.containsKey(searchId)) {
            System.out.println("Product " + searchId + " Quantity: " + a.get(searchId));
        } else {
            System.out.println("Product Not Found");
        }

        System.out.println("Products with Quantity Below 5:");

        for (Map.Entry<Integer, Integer> entry : a.entrySet()) {
            if (entry.getValue() < 5) {
                System.out.println("Product ID: " + entry.getKey() +
                        " Quantity: " + entry.getValue());
            }
        }

        a.remove(104);
        a.remove(110);

        System.out.println("After Removing Out-of-Stock Products:");

        for (Map.Entry<Integer, Integer> entry : a.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() +
                    " Quantity: " + entry.getValue());
        }
    }
}