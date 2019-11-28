package com.linwl.cloudDemo.gateways.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author ：shanyao
 * @date ：Created in 2019/7/9 16:56
 * @description：
 */
@Configuration
public class CorsConfig {

    private CorsConfiguration buildConfig()
    {
        CorsConfiguration configuration =new CorsConfiguration();
        configuration.addAllowedOrigin("*"); // 1 设置访问源地址
        configuration.addAllowedHeader("*"); // 2 设置访问源请求头
        configuration.addAllowedMethod("*"); // 3 设置访问源请求方法
        configuration.addExposedHeader("Content-Disposition");
        return configuration;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig()); // 4 对接口配置跨域设置
        return new CorsFilter(source);
    }
}
