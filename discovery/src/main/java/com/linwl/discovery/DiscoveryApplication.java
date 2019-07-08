package com.linwl.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：shanyao
 * @date ：Created in 2019/7/8 9:47
 * @description：
 */
@EnableEurekaServer
@SpringBootApplication
public class DiscoveryApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(DiscoveryApplication.class,args);
    }
}
