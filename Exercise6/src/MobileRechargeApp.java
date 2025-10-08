import java.util.Scanner;

// Interface for recharge actions
interface RechargeActions {
    void doRecharge(double amount);
    void checkBalance();
    void viewCustomerDetails();
}

// Abstract class for Customer details
abstract class Customer {
    protected int customerId;
    protected String customerName;
    protected double mobileBalance;

    // Constructor
    public Customer(int customerId, String customerName, double mobileBalance) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobileBalance = mobileBalance;
    }
}

// Recharge system class
class RechargeSystem extends Customer implements RechargeActions {

    // Constructor
    public RechargeSystem(int customerId, String customerName, double mobileBalance) {
        super(customerId, customerName, mobileBalance);
    }

    // Implementing interface methods
    @Override
    public void doRecharge(double amount) {
        if (amount > 0) {
            mobileBalance += amount;
            System.out.println(" Recharge successful! ₹" + amount + " added.");
        } else {
            System.out.println(" Invalid recharge amount.");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println(" Current Mobile Balance: ₹" + mobileBalance);
    }

    @Override
    public void viewCustomerDetails() {
        System.out.println("\n--- Customer Details ---");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Mobile Balance: ₹" + mobileBalance);
    }
}

// Main class
public class MobileRechargeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get customer details
        System.out.println("Enter Customer Details:");
        System.out.print("Customer ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Initial Balance: ₹");
        double balance = sc.nextDouble();

        RechargeSystem recharge = new RechargeSystem(id, name, balance);

        int choice;
        do {
            System.out.println("\n--- MOBILE RECHARGE MENU ---");
            System.out.println("1. Do Recharge");
            System.out.println("2. Check Balance");
            System.out.println("3. View Customer Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter recharge amount: ₹");
                    double amt = sc.nextDouble();
                    recharge.doRecharge(amt);
                    break;
                case 2:
                    recharge.checkBalance();
                    break;
                case 3:
                    recharge.viewCustomerDetails();
                    break;
                case 4:
                    System.out.println(" Thank you for using Mobile Recharge App!");
                    break;
                default:
                    System.out.println(" Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
