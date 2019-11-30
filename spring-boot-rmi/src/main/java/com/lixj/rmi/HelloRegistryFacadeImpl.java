package com.lixj.rmi;

import org.springframework.stereotype.Service;

@Service("helloRegistryFacade")
public class HelloRegistryFacadeImpl implements HelloRegistryFacade {

    @Override
    public String helloWorld(String name){
        return "hello world";
    }
}
