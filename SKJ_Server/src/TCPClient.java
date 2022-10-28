import java.net.*;
import java.io.*;

public class TCPClient {

    public static void main(String[] args) {
        String address = "10.20.13.14";
        int port = 50856;

        try (Socket socket = new Socket(address,port)) {
            // Reading data sent from the SERVER to the CLIENT
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = in.readLine();
            System.out.println(line);
            // END

            // Sending data from the CLIENT to the SERVER
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println("s26092");
            // END

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
