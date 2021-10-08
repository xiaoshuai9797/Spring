package com.pctc.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectConfig {

    //@Bean(name="book1")
   // @Bean("book2")
    //@Bean(value="book2")
   /* 如果使用上面的注解，那么test中getbean里面写@bean里面的名字
    没写则默认是方法名*/
    @Bean
    public Book bookbook(){
        return  new Book();
    }


    @Bean
    public  Student student(){
        return  new Student();
    }



}
