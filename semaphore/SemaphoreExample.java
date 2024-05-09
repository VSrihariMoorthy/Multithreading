// SemaphoreExample.java
import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        final int MAX_CONCURRENT_JOBS = 3; // Max number of concurrent print jobs
        Semaphore semaphore = new Semaphore(MAX_CONCURRENT_JOBS);
        Printer printer = new Printer();

        // Creating and starting 10 printing jobs
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new PrintingJob(printer, semaphore), "Job-" + i);
            thread.start();
        }
    }
}