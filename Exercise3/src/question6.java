import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder encoded = new StringBuilder();

        int count = 1;
        for (int i = 1; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                encoded.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        System.out.println("Encoded string: " + encoded.toString());

        sc.close();
    }
}
