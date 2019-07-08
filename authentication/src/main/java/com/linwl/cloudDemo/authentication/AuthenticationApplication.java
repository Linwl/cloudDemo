package com.linwl.cloudDemo.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：shanyao
 * @date ：Created in 2019/7/8 15:10
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AuthenticationApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(AuthenticationApplication.class,args);
    }
}
