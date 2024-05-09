// PrintingJob.java
import java.util.concurrent.Semaphore;

public class PrintingJob implements Runnable {
    private Printer printer;
    private Semaphore semaphore;

    public PrintingJob(Printer printer, Semaphore semaphore) {
        this.printer = printer;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire(); // Acquire a permit from the semaphore
            System.out.println(Thread.currentThread().getName() + " started printing.");
            printer.print();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
        } finally {
            semaphore.release(); // Release the permit back to the semaphore
        }
    }
}