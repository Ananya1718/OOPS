// MultiplesOfFive class implementing Runnable interface
class MultiplesOfFive implements Runnable {
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

// EvenNumbers class implementing Runnable interface
class EvenNumbers implements Runnable {
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
public class question1 {
    public static void main(String[] args) {
        // Create Runnable objects
        Runnable multiplesOfFive = new MultiplesOfFive();
        Runnable evenNumbers = new EvenNumbers();

        // Create Thread objects using Runnable targets
        Thread t1 = new Thread(multiplesOfFive);
        Thread t2 = new Thread(evenNumbers);

        // Start both threads
        t1.start();
        t2.start();
    }
}
