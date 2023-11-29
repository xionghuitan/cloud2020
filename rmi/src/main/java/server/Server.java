package server;

import model.Hello;
import model.impl.HelloImpl1;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args) throws RemoteException {
        //创建对象
        Hello hello = new HelloImpl1();
        // 本地主机上的远程对象注册表Registry的实例，
        // 并指定端口，这一步必不可少（Java默认端口是1099）
        Registry registry = LocateRegistry.createRegistry(1099);
        //绑定对象到注册表，并给它取名为hello
        registry.rebind("hello", hello);
    }
}
