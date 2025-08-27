import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // first character
        char firstChar = input.charAt(0);

        // replace all occurrences of first char with '$'
        String modified = input.substring(1).replace(firstChar, '$');

        // add first char back
        modified = firstChar + modified;

        System.out.println("Output: " + modified);

        sc.close();
    }
}
