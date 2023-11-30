package client;

import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        // Socket clientSocket = new Socket("192.168.10.102", 9999);
        Socket client = new Socket("192.168.10.102", 52258);
        Send send = new Send(client);
        Receive receive = new Receive(client);
        new Thread(send).start();
        new Thread(receive).start();
    }
}
