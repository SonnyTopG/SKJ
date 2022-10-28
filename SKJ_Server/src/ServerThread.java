import java.io.*;
import java.net.*;


public class ServerThread extends Thread {
    private Socket socket;

    public ServerThread(Socket socket) {
        super();
        this.socket = socket;
    }

    public void run() {
        try {
            // Sending date from the SERVER to the CLIENT
            OutputStream output = socket.getOutputStream();
            PrintWriter ps = new PrintWriter(output, true);
            ps.println("Hi, You're connected to the server!");
            // END

            // Reading data sent from the CLIENT to the SERVER
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            // END

            String line;
            while((line = in.readLine()) != null && !line.isEmpty())
            {
                System.out.println(line);
            }

            out.println("HTTP/1.1 200 OK");
            out.println();
            out.println();
        } catch (IOException e) {}

        try {
            socket.close();
        } catch (IOException e) {}
    }
}