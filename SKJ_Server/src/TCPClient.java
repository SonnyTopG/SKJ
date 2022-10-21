import java.net.*;
import java.io.*;

public class TCPClient {

    public static void main(String[] args) {
        String address = "10.13.63.17";
        int port = 12345;

        try (Socket socket = new Socket(address,port)) {

            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println("s26092");

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
