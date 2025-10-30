import java.io.*;
import java.util.Scanner;

public class question2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "student.txt";

        try {
            // Write data to file
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            for (int i = 1; i <= n; i++) {
                System.out.println("\nEnter details for Student " + i + ":");
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Roll No: ");
                int roll = sc.nextInt();
                System.out.print("Marks: ");
                double marks = sc.nextDouble();
                sc.nextLine(); // consume newline

                bw.write("Name: " + name + ", Roll No: " + roll + ", Marks: " + marks);
                bw.newLine();
            }

            bw.close();
            fw.close();
            System.out.println("\n✅ Data successfully written to " + fileName);

            // Read data from file
            System.out.println("\n--- Reading Data from File ---");
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();
            System.out.println("\n✅ File read successfully.");

        } catch (IOException e) {
            System.out.println("⚠️ An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
