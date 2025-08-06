import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] monthlyUsage = new int[12];
        int totalUnits = 0;

        // Input unit usage for each month
        for (int i = 0; i < 12; i++) {
            System.out.print("Enter electricity usage for month " + (i + 1) + ": ");
            monthlyUsage[i] = scanner.nextInt();
            totalUnits += monthlyUsage[i];
        }

        // Calculate average usage
        double averageUsage = totalUnits / 12.0;

        // Display results
        System.out.println("\nTotal electricity usage for 12 months: " + totalUnits + " units");
        System.out.printf("Average monthly usage: %.2f units\n", averageUsage);

        // Check for high consumption
        if (averageUsage > 500) {
            System.out.println("High Consumption Alert!");
        }
    }
}
