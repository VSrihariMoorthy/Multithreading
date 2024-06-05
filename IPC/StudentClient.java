import java.io.*;
import java.net.*;

public class StudentClient {
    public static void main(String[] args) {
        // Define the server hostname and port number
        String hostname = "localhost";
        int port = 12345;

        // Use try-with-resources to automatically close resources
        try (Socket socket = new Socket(hostname, port)) {
            // Create output stream to send data to the server
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            // Create input stream to receive data from the server
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // Create a reader to read input from the console
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String text;

            // Prompt the user to enter their exam submission
            System.out.println("Enter your exam submission:");
            text = consoleReader.readLine();

            // Send the user's input to the server
            writer.println(text);

            // Read and print the server's response
            String response = reader.readLine();
            System.out.println(response);

        } catch (UnknownHostException ex) {
            // Handle case where the server is not found
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            // Handle input/output errors
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}
