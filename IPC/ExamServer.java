import java.io.*;
import java.net.*;

public class ExamServer {
    public static void main(String[] args) {
        // Try-with-resources to ensure server socket is closed automatically
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Exam server is listening on port 12345");

            // Infinite loop to keep the server running and accepting new connections
            while (true) {
                // Accept a new client connection
                Socket socket = serverSocket.accept();
                System.out.println("New student connected");

                // Create a new thread to handle the client connection
                new ExamHandler(socket).start();
            }
        } catch (IOException ex) {
            // Handle server exceptions
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}

// Thread class to handle individual client connections
class ExamHandler extends Thread {
    private Socket socket;

    public ExamHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        // Try-with-resources to ensure streams are closed automatically
        try (InputStream input = socket.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input));
             OutputStream output = socket.getOutputStream();
             PrintWriter writer = new PrintWriter(output, true)) {

            String studentSubmission;

            // Read and process client submissions
            while ((studentSubmission = reader.readLine()) != null) {
                System.out.println("Received: " + studentSubmission);
                // Here, you can process the submission, e.g., save to a database
                writer.println("Submission received: " + studentSubmission);
            }
        } catch (IOException ex) {
            // Handle exceptions for client handling
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
