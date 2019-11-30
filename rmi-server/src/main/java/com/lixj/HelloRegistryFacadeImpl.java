package com.lixj;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloRegistryFacadeImpl extends UnicastRemoteObject implements HelloRegistryFacade {

    protected HelloRegistryFacadeImpl() throws RemoteException {
    }

    @Override
    public String helloWorld(String name){
        return "hello world";
    }
}
