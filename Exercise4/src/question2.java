 import java.util.Scanner;

class FoodOrder {
    private int orderId;
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodOrder(int orderId, String itemName, double price, int quantity) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total bill
    public double calculateBill() {
        return (price * quantity) + 50; // 50 is delivery charge
    }

    // Display order details
    public void displayBill() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Food Item: " + itemName);
        System.out.println("Price per item: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill (with delivery): ₹" + calculateBill());
        System.out.println("--------------------------");
    }
}

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First order
        System.out.println("Enter details for Order 1:");
        System.out.print("Order ID: ");
        int id1 = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Food Item Name: ");
        String item1 = sc.nextLine();
        System.out.print("Price: ");
        double price1 = sc.nextDouble();
        System.out.print("Quantity: ");
        int qty1 = sc.nextInt();

        FoodOrder order1 = new FoodOrder(id1, item1, price1, qty1);

        // Second order
        System.out.println("\nEnter details for Order 2:");
        System.out.print("Order ID: ");
        int id2 = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Food Item Name: ");
        String item2 = sc.nextLine();
        System.out.print("Price: ");
        double price2 = sc.nextDouble();
        System.out.print("Quantity: ");
        int qty2 = sc.nextInt();

        FoodOrder order2 = new FoodOrder(id2, item2, price2, qty2);

        // Display bills
        System.out.println("\n===== Order Summaries =====");
        order1.displayBill();
        order2.displayBill();

        sc.close();
    }
}
