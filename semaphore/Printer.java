public class Printer {
    // Simulate printing by just sleeping for a second
    public void print() {
        try {
            Thread.sleep(1000); // Simulating the printing task
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
            System.out.println("Printing was interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " finished printing.");
    }
}