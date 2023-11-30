package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        System.out.println("-------服务器已经开启-------");
        ServerSocket server = new ServerSocket(8899);
        Socket socket = server.accept();
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        while (true) {
            String str = dis.readUTF();
            System.out.println("客户端发送的数据为：--->"+ str);
            dos.writeUTF("服务器收到了：" + str);
        }

        // CloseUtil.closeAll(dos,dis,socket);

    }
}
