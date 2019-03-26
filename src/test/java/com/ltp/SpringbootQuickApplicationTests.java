package com.ltp;

import com.ltp.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
/*
* Spring单元测试
*
*
* */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootQuickApplicationTests {
    @Autowired
    Person person;
    @Test
    public void contextLoads() {
        System.out.println(person);
    }
    @Test
    public void beanTese(){

    }

}
