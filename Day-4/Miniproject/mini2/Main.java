import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static HashMap<Integer, Integer> inventory = new HashMap<>();
    static HashMap<Integer, String> productNames = new HashMap<>();
    static HashMap<Integer, String> productCategories = new HashMap<>();
    static HashMap<Integer, Double> productPrices = new HashMap<>();

    static HashSet<String> categories = new HashSet<>();
    static LinkedHashSet<String> recentProducts = new LinkedHashSet<>();

    static void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (inventory.containsKey(id)) {
            System.out.println("Product ID already exists!");
            return;
        }

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Product Category: ");
        String category = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Available Quantity: ");
        int quantity = sc.nextInt();

        if (price < 0 || quantity < 0) {
            System.out.println("Price and quantity cannot be negative!");
            return;
        }

        inventory.put(id, quantity);
        productNames.put(id, name);
        productCategories.put(id, category);
        productPrices.put(id, price);

        categories.add(category);
        recentProducts.add(name);

        System.out.println("Product Added Successfully!");
    }

    static void displayProducts() {
        if (inventory.isEmpty()) {
            System.out.println("No products available!");
            return;
        }

        System.out.println("\n---------- PRODUCT INVENTORY ----------");
        System.out.printf("%-10s %-15s %-15s %-12s %-10s%n",
                "ID", "Product", "Category", "Price", "Quantity");

        for (int id : inventory.keySet()) {
            System.out.printf("%-10d %-15s %-15s %-12.2f %-10d%n",
                    id,
                    productNames.get(id),
                    productCategories.get(id),
                    productPrices.get(id),
                    inventory.get(id));
        }

        System.out.println("Total Products: " + inventory.size());
    }

    static void searchProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        if (inventory.containsKey(id)) {
            System.out.println("Product ID: " + id);
            System.out.println("Product Name: " + productNames.get(id));
            System.out.println("Category: " + productCategories.get(id));
            System.out.println("Price: " + productPrices.get(id));
            System.out.println("Available Quantity: " + inventory.get(id));
        } else {
            System.out.println("Product Not Found!");
        }
    }

    static void updateQuantity() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        if (!inventory.containsKey(id)) {
            System.out.println("Product Not Found!");
            return;
        }

        System.out.print("Enter Quantity to Add: ");
        int quantity = sc.nextInt();

        if (quantity <= 0) {
            System.out.println("Enter a valid positive quantity!");
            return;
        }

        inventory.put(id, inventory.get(id) + quantity);
        System.out.println("Stock Updated Successfully!");
        System.out.println("Available Quantity: " + inventory.get(id));
    }

    static void sellProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        if (!inventory.containsKey(id)) {
            System.out.println("Product Not Found!");
            return;
        }

        System.out.print("Enter Quantity Sold: ");
        int quantity = sc.nextInt();

        if (quantity <= 0) {
            System.out.println("Enter a valid positive quantity!");
        } else if (quantity > inventory.get(id)) {
            System.out.println("Insufficient Stock!");
        } else {
            inventory.put(id, inventory.get(id) - quantity);
            System.out.println("Sale Completed Successfully!");
            System.out.println("Product ID: " + id);
            System.out.println("Remaining Quantity: " + inventory.get(id));
        }
    }

    static void removeProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        if (!inventory.containsKey(id)) {
            System.out.println("Product Not Found!");
            return;
        }

        String name = productNames.get(id);
        String category = productCategories.get(id);

        inventory.remove(id);
        productNames.remove(id);
        productCategories.remove(id);
        productPrices.remove(id);

        if (!productCategories.containsValue(category)) {
            categories.remove(category);
        }

        if (!productNames.containsValue(name)) {
            recentProducts.remove(name);
        }

        System.out.println("Product Removed Successfully!");
    }

    static void addCategory() {
        sc.nextLine();
        System.out.print("Enter Category Name: ");
        String category = sc.nextLine();

        if (categories.add(category)) {
            System.out.println("Category Added Successfully!");
        } else {
            System.out.println("Category Already Exists!");
        }
    }

    static void displayCategories() {
        System.out.println("\n--------- PRODUCT CATEGORIES ---------");

        if (categories.isEmpty()) {
            System.out.println("No Categories Available!");
        } else {
            for (String category : categories) {
                System.out.println(category);
            }
        }

        System.out.println("Total Unique Categories: " + categories.size());
    }

    static void sortedCategories() {
        TreeSet<String> sorted = new TreeSet<>(categories);

        System.out.println("\n--------- SORTED CATEGORIES ----------");

        if (sorted.isEmpty()) {
            System.out.println("No Categories Available!");
            return;
        }

        System.out.println("Ascending Order: " + sorted);
        System.out.println("First Category: " + sorted.first());
        System.out.println("Last Category: " + sorted.last());
        System.out.println("Descending Order: " + sorted.descendingSet());
    }

    static void displayRecentProducts() {
        System.out.println("\n------ RECENTLY ADDED PRODUCTS ------");

        if (recentProducts.isEmpty()) {
            System.out.println("No Products Available!");
        } else {
            for (String name : recentProducts) {
                System.out.println(name);
            }
        }
    }

    static void searchRecentProduct() {
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        if (recentProducts.contains(name)) {
            System.out.println("Product Found!");
        } else {
            System.out.println("Product Not Found!");
        }
    }

    static void removeRecentProduct() {
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        if (recentProducts.remove(name)) {
            System.out.println("Product Removed From Recent Products!");
        } else {
            System.out.println("Product Not Found!");
        }
    }

    static void inventoryReport() {
        if (inventory.isEmpty()) {
            System.out.println("No Products Available!");
            return;
        }

        displayProducts();

        int totalQuantity = 0;
        int highestQuantity = -1;
        int highestProductId = -1;

        System.out.println("\n------ PRODUCTS WITH QUANTITY BELOW 5 ------");

        for (int id : inventory.keySet()) {
            int quantity = inventory.get(id);
            totalQuantity += quantity;

            if (quantity < 5) {
                System.out.println(productNames.get(id) + " - " + quantity);
            }

            if (quantity > highestQuantity) {
                highestQuantity = quantity;
                highestProductId = id;
            }
        }

        System.out.println("\nTotal Product Units: " + totalQuantity);

        System.out.println("Highest Available Quantity Product: "
                + productNames.get(highestProductId));

        System.out.println("Highest Quantity: " + highestQuantity);

        displayCategories();
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n========================================");
            System.out.println("       PRODUCT INVENTORY SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product Quantity");
            System.out.println("5. Sell Product");
            System.out.println("6. Remove Product");
            System.out.println("7. Add Product Category");
            System.out.println("8. Display Unique Categories");
            System.out.println("9. Display Sorted Categories");
            System.out.println("10. Display Recently Added Products");
            System.out.println("11. Generate Inventory Report");
            System.out.println("12. Search Recent Product");
            System.out.println("13. Remove Recent Product");
            System.out.println("14. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    updateQuantity();
                    break;
                case 5:
                    sellProduct();
                    break;
                case 6:
                    removeProduct();
                    break;
                case 7:
                    addCategory();
                    break;
                case 8:
                    displayCategories();
                    break;
                case 9:
                    sortedCategories();
                    break;
                case 10:
                    displayRecentProducts();
                    break;
                case 11:
                    inventoryReport();
                    break;
                case 12:
                    searchRecentProduct();
                    break;
                case 13:
                    removeRecentProduct();
                    break;
                case 14:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 14);
    }
}