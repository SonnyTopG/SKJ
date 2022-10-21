import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.*;

public class Server {

    public static void listen() throws IOException {

        ServerSocket serverSocket = new ServerSocket(2706);
        while(true){
            Socket socket = serverSocket.accept();

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String line = reader.read();

        }
    }


    public static void main(String[] args) {

    }
}
