package com.ltp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
/*
*
* 在SpringBoot入口文件中导入Spring的配置文件，让其生效
*
* */
/*@ImportResource(value = {"classpath:bean.xml"})*/
@SpringBootApplication
public class SpringbootQuickApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootQuickApplication.class, args);
    }

}
