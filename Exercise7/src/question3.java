import java.util.Scanner;

// Custom exception for name length
class LengthException extends Exception {
    public LengthException(String message) {
        super(message);
    }
}

// Custom exception for failed student
class FailedException extends Exception {
    public FailedException(String message) {
        super(message);
    }
}

// Custom exception for not first class
class NotFirstClassException extends Exception {
    public NotFirstClassException(String message) {
        super(message);
    }
}

// Student class
class Student {
    String name;
    int mark1, mark2, mark3;

    public Student(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public void validate() throws LengthException, FailedException, NotFirstClassException {
        if (name.length() > 7) {
            throw new LengthException("❌ Name length is greater than 7 characters!");
        }

        double average = (mark1 + mark2 + mark3) / 3.0;

        if (average < 50) {
            throw new FailedException("❌ Student has failed. Average: " + average);
        } else if (average < 75) {
            throw new NotFirstClassException("⚠️ Not a First Class Student. Average: " + average);
        } else {
            System.out.println("✅ First Class Student! Average: " + average);
        }
    }
}

// Main class
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Mark 1: ");
            int m1 = sc.nextInt();
            System.out.print("Enter Mark 2: ");
            int m2 = sc.nextInt();
            System.out.print("Enter Mark 3: ");
            int m3 = sc.nextInt();

            Student s = new Student(name, m1, m2, m3);
            s.validate();

        } catch (LengthException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (FailedException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NotFirstClassException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("\nProgram execution completed.");
        }
    }
}
