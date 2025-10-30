import java.io.*;
import java.util.*;

public class compulsoryques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== FILE MANAGER MENU =====");
            System.out.println("1. Create a new file");
            System.out.println("2. Rename a file");
            System.out.println("3. Delete a file");
            System.out.println("4. Create a directory");
            System.out.println("5. Find absolute path of a file");
            System.out.println("6. Display all file names of a directory");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter file name to create: ");
                    String fileName = sc.nextLine();
                    try {
                        File file = new File(fileName);
                        if (file.createNewFile()) {
                            System.out.println("✅ File created: " + file.getName());
                        } else {
                            System.out.println("⚠️ File already exists.");
                        }
                    } catch (IOException e) {
                        System.out.println("Error creating file: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter existing file name: ");
                    String oldName = sc.nextLine();
                    System.out.print("Enter new file name: ");
                    String newName = sc.nextLine();
                    File oldFile = new File(oldName);
                    File newFile = new File(newName);
                    if (oldFile.renameTo(newFile)) {
                        System.out.println("✅ File renamed successfully.");
                    } else {
                        System.out.println("⚠️ Failed to rename file.");
                    }
                    break;

                case 3:
                    System.out.print("Enter file name to delete: ");
                    String delName = sc.nextLine();
                    File delFile = new File(delName);
                    if (delFile.delete()) {
                        System.out.println("🗑️ File deleted successfully.");
                    } else {
                        System.out.println("⚠️ Failed to delete file.");
                    }
                    break;

                case 4:
                    System.out.print("Enter directory name to create: ");
                    String dirName = sc.nextLine();
                    File dir = new File(dirName);
                    if (dir.mkdir()) {
                        System.out.println("📁 Directory created successfully.");
                    } else {
                        System.out.println("⚠️ Failed to create directory.");
                    }
                    break;

                case 5:
                    System.out.print("Enter file name to find path: ");
                    String pathFile = sc.nextLine();
                    File absFile = new File(pathFile);
                    System.out.println("📍 Absolute Path: " + absFile.getAbsolutePath());
                    break;

                case 6:
                    System.out.print("Enter directory name: ");
                    String folderName = sc.nextLine();
                    File folder = new File(folderName);
                    if (folder.exists() && folder.isDirectory()) {
                        String[] files = folder.list();
                        System.out.println("\nFiles in " + folderName + ":");
                        for (String f : files) {
                            System.out.println("📄 " + f);
                        }
                    } else {
                        System.out.println("⚠️ Directory not found.");
                    }
                    break;

                case 7:
                    System.out.println("👋 Exiting File Manager... Bye!");
                    break;

                default:
                    System.out.println("⚠️ Invalid choice. Try again!");
            }
        } while (choice != 7);

        sc.close();
    }
}
