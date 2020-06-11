import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {


        try {
            ServerSocket serverSocket = new ServerSocket(6780);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            Socket socket = serverSocket.accept();
            System.out.println("Connection Established");
            System.out.println("Waiting for input... \n");

            while (true) {
                BufferedReader receivedFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                DataOutputStream pw = new DataOutputStream(socket.getOutputStream());

                String receivedString = receivedFromClient.readLine();

                if (receivedString.equalsIgnoreCase("quit")) {
                    System.out.println("Client terminated the connection");
                    break;
                }

                System.out.println("Client" + ":> " + receivedString);

                System.out.print("You: ");
                String message = bufferedReader.readLine();
                pw.writeBytes(message + "\n");
            }
            socket.close();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}