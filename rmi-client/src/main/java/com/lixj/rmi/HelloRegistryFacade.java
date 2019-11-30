package com.lixj.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloRegistryFacade extends Remote {
    /*
    定义接口，接口一定要抛出RemoteException异常，不然报错
     */
    String helloWorld(String name) throws RemoteException;
}
