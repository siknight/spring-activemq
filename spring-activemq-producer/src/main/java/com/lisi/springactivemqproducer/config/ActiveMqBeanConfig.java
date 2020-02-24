package com.lisi.springactivemqproducer.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActiveMqBeanConfig {

    //定义存放消息的队列
    @Bean
    public ActiveMQQueue queue() {
        return new ActiveMQQueue("test");
    }
}
