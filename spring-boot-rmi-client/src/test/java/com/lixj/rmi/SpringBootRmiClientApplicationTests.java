package com.lixj.rmi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.rmi.RemoteException;

@SpringBootTest
class SpringBootRmiClientApplicationTests {
	@Autowired
	private HelloRegistryFacade helloRegistryFacade;

	@Test
	void contextLoads() throws RemoteException {
		System.out.println(helloRegistryFacade.helloWorld("hello world"));
	}

}
