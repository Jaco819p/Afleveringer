import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);
          int port = 6780;
        InetAddress address;
        DatagramPacket packet;

        System.out.println("Welcome: \n");

        try {
             DatagramSocket socket = new DatagramSocket();
            address = InetAddress.getByName("localhost");

            while (true) {
                System.out.print("C:> ");
                String messageToSend = inputs.nextLine();
                byte[] output = messageToSend.getBytes();
                packet = new DatagramPacket(output, output.length, address, port);
                socket.send(packet);

                if (messageToSend.equalsIgnoreCase("quit")) {
                    break;
                }

                byte[] input = new byte[256];
                packet = new DatagramPacket(input, input.length);
                socket.receive(packet);
                String received = new String(input);
                System.out.println("S:> " + received);
            }
            System.out.println("Closing Program.");
            socket.close();
            System.exit(0);

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}