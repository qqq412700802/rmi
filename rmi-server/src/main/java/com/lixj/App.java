package com.lixj;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException {
        LocateRegistry.createRegistry(1099);

        HelloRegistryFacade helloRegistryFacade = new HelloRegistryFacadeImpl();

//        registry.rebind("helloRegistry", helloRegistryFacade);
        Naming.bind("rmi://localhost:1099/helloRegistry", helloRegistryFacade);
        System.out.println("========启动RMI服务成功========");
    }
}
