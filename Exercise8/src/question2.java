// Thread class for printing multiples of 5
class MultiplesOfFiveThread extends Thread {
    public void run() {
        System.out.println("Multiples of 5 between 1 and 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(500); // half-second delay
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println("\n--- End of Multiples of 5 ---");
    }
}

// Thread class for printing even numbers
class EvenNumbersThread extends Thread {
    public void run() {
        System.out.println("Even numbers between 1 and 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(500); // half-second delay
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println("\n--- End of Even Numbers ---");
    }
}

// Main class
public class question2 {
    public static void main(String[] args) {
        // Create thread objects
        MultiplesOfFiveThread t1 = new MultiplesOfFiveThread();
        EvenNumbersThread t2 = new EvenNumbersThread();

        // Start both threads
        t1.start();
        t2.start();
    }
}
