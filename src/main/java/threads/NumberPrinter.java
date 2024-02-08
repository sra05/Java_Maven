package threads;

public class NumberPrinter {
    public static void printEvenNumbers() {
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 60; i += 2) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(100); // Sleep for a short time to mimic processing
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        evenThread.start();
    }

    public static void printOddNumbers() {
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 60; i += 2) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(100); // Sleep for a short time to mimic processing
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        oddThread.start();
    }
}
