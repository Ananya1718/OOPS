import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        final double BASE_PRICE = 200.0;

        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.print("Enter the day of booking: ");
        String day = scanner.nextLine().trim().toLowerCase();

        double discount = 0.0;

        // Apply age-based discount
        if (age < 5) {
            System.out.println("Ticket is Free.");
            return;
        } else if (age >= 5 && age <= 18) {
            discount += 0.40;
        } else if (age > 60) {
            discount += 0.30;
        }

        // Apply weekday discount
        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") ||
            day.equals("thursday") || day.equals("friday")) {
            discount += 0.10;
        }

        double finalPrice = BASE_PRICE * (1 - discount);
        System.out.printf("Final ticket price: ₹%.2f\n", finalPrice);
    }
}
