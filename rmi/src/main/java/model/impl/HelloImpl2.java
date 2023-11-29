package model.impl;

import model.Hello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl2 implements Hello {

    @Override
    public String welcome(String name) throws RemoteException {
        return "Hello " + name;
    }

    public HelloImpl2() throws RemoteException {
        //参数 port 指定监听的端口，如果取值为0，就表示监听任意一个匿名端口
        UnicastRemoteObject.exportObject(this, 0);
    }
}
