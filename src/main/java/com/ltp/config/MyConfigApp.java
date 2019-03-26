package com.ltp.config;

import com.ltp.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyConfigApp
 * @Auther: Ltp
 * @Date: 19-3-26 上午11:00
 * @Description: Spring组件
 */


/*
* @Configuration:
*   指明当前类为一个配置类，来代替之前Spring的配置文件
*
* */
@Configuration
public class MyConfigApp {
    @Bean
    public HelloService hello(){
        System.out.println("给容器中添加组件了");
        return new HelloService();
    }
}
