package model.impl;

import model.Hello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl1 extends UnicastRemoteObject implements Hello {
    public HelloImpl1() throws RemoteException {
    }

    @Override
    public String welcome(String name) throws RemoteException {
        return "Hello " + name;
    }
}
