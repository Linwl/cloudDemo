package com.linwl.cloudDemo.gateways;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：shanyao
 * @date ：Created in 2019/7/9 9:29
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
@EnableFeignClients
public class GatewayApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(GatewayApplication.class,args);
        System.out.println("API服务网关启动...");
    }
}
