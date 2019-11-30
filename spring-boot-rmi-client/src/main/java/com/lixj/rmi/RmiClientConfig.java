package com.lixj.rmi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class RmiClientConfig {
    @Bean
    public HelloRegistryFacade helloRegistryFacade() {
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost:1099/helloRegistryFacade");
        rmiProxyFactoryBean.setServiceInterface(HelloRegistryFacade.class);
        rmiProxyFactoryBean.afterPropertiesSet();
        Object object = rmiProxyFactoryBean.getObject();

        return (HelloRegistryFacade) object;
    }

}
