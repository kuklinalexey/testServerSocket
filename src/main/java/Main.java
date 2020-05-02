import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static final int SERVER_PORT = 8080;

    public static void main(String[] args) throws InterruptedException, IOException {

        ServerSocket server = new ServerSocket(SERVER_PORT);

        System.out.println("Server started...");

        Socket socket = server.accept();

        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader in = new BufferedReader(inputStreamReader);

        while (true) {
            String str = in.readLine();

            if (str == null) break;

            System.out.println(str);
        }

        socket.close();

        System.out.println("Server stopped...");
    }
}