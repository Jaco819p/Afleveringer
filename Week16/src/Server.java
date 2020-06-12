import java.net.*;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        try {
            DatagramSocket socket = new DatagramSocket(6780);
            System.out.println("Server open on port: 6780\nWaiting for client...\n");

            while (true) {
                byte[] input = new byte[256];
                DatagramPacket packet = new DatagramPacket(input, input.length);
                socket.receive(packet);

                String receivedMessage = new String(input);
                System.out.println("C:> " + receivedMessage);

                if (receivedMessage.equalsIgnoreCase("quit")) {
                    System.out.println("Client disconnected");
                    break;
                }

                byte[] output = new byte[256];
                System.out.print("S:> ");
                String response = inputs.nextLine();
                output = response.getBytes();

                InetAddress address = packet.getAddress();
                int port = packet.getPort();
                packet = new DatagramPacket(output, output.length, address, port);
                socket.send(packet);
            }

            System.out.println("Closing server.");
            socket.close();
            System.exit(0);

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}