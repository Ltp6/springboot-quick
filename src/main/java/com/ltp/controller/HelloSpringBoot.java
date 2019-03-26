package com.ltp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloSpringBoot
 * @Auther: Ltp
 * @Date: 19-3-20 上午11:07
 * @Description:
 */
@RestController//相当于@Controller与@ResponseBody
public class HelloSpringBoot {
    @RequestMapping(value = "/hello")
    public String hello(){
        return "Hello Springboot!!!";
    }
}
