import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter the numbers (space-separated): ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        // Convert to int array
        int[] numbers = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }

        // Number to search
        System.out.print("Enter the number to be searched: ");
        int searchNum = scanner.nextInt();

        // Count occurrences
        int count = 0;
        for (int num : numbers) {
            if (num == searchNum) {
                count++;
            }
        }

        // Output
        if (count > 0) {
            System.out.println("Number Found " + count + " times");
        } else {
            System.out.println("The number not available");
        }

        scanner.close();
    }
}

