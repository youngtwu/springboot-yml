package com.example.springbootyml.config;

import com.example.springbootyml.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * SpringBoot推荐给容器中添加组件的方式；推荐使用全注解的方式
 * 1、配置类@Configuration------>Spring配置文件
 * 2、使用@Bean给容器中添加组件
 */
@Configuration
public class MyConfig {

        @Bean//将方法的返回值添加到容器中；容器中这个组件默认的id就是方法名
        public HelloService helloService(){
            System.out.println("配置类@Bean给容器中添加组件了...");
            return new HelloService();
        }
}
