package com.linwl.cloudDemo.configs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ：shanyao
 * @date ：Created in 2019/7/8 14:09
 * @description：
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(ConfigApplication.class,args);
        System.out.println("全局配置中心启动...");
    }
}
