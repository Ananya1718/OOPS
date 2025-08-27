import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] multiples = new int[10]; // max 10, safe assumption
        int count = 0;

        // Input 10 numbers
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();

            // Check for multiple of both 3 and 9 (i.e., divisible by 9)
            if (numbers[i] % 9 == 0) {
                multiples[count++] = numbers[i];
            }
        }

        // Display result
        if (count > 0) {
            System.out.print("The numbers that are multiples of both 9 and 3: ");
            for (int i = 0; i < count; i++) {
                System.out.print(multiples[i]);
                if (i < count - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        } else {
            System.out.println("No multiples of 3 and 9 found.");
        }

        scanner.close();
    }
}
