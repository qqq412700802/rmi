package com.lixj.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("rmi://localhost:1099/helloRegistryFacade");

        HelloRegistryFacade helloRegistryFacade = (HelloRegistryFacade) registry.lookup("helloRegistryFacade");

        System.out.println(helloRegistryFacade.helloWorld("hello world"));
    }
}
