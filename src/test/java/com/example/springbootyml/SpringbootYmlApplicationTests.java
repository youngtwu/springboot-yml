package com.example.springbootyml;

import com.example.springbootyml.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootYmlApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private ApplicationContext context;

    @Test
    public void testGetBean(){
        boolean b = context.containsBean("helloService");
        System.out.println(b);
    }

    @Test
    public void contextLoads() {
        System.out.println(person.toString());
    }


}
