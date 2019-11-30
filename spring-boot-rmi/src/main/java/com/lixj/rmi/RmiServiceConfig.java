package com.lixj.rmi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
public class RmiServiceConfig {
    @Bean
    public RmiServiceExporter registerService(HelloRegistryFacade helloRegistryFacade) {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("helloRegistryFacade");
        rmiServiceExporter.setService(helloRegistryFacade);
        rmiServiceExporter.setServiceInterface(HelloRegistryFacade.class);
        rmiServiceExporter.setRegistryPort(1099);

        return rmiServiceExporter;
    }

}
