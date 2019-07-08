package com.linwl.cloudDemo.configs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ：shanyao
 * @date ：Created in 2019/7/8 14:09
 * @description：
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(ConfigApplication.class,args);
    }
}
