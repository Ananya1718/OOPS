// Thread for printing odd numbers
class OddNumbersThread extends Thread {
    public void run() {
        System.out.println("Odd numbers between 1 and 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(400); // small delay
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println("\n--- End of Odd Numbers ---");
    }
}

// Thread for printing multiples of 3
class MultiplesOfThreeThread extends Thread {
    public void run() {
        System.out.println("Multiples of 3 between 1 and 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(400); // small delay
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println("\n--- End of Multiples of 3 ---");
    }
}

// Main class
public class question3 {
    public static void main(String[] args) {
        // Create thread objects
        OddNumbersThread t1 = new OddNumbersThread();
        MultiplesOfThreeThread t2 = new MultiplesOfThreeThread();

        // Start both threads
        t1.start();
        t2.start();
    }
}
