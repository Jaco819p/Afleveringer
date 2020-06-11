import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 6780);
            BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Connection established");
            System.out.println();

            while (true) {
                DataOutputStream sendToServer = new DataOutputStream(socket.getOutputStream());
                BufferedReader inFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                System.out.print("You: ");
                String message = inFromUser.readLine();
                sendToServer.writeBytes(message + "\n");

                String receivedFromServer = inFromServer.readLine();
                System.out.println("Server:> " + receivedFromServer);

                if (message.equalsIgnoreCase("quit")) {
                    System.out.println("Connection terminated");
                    break;
                }

            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}