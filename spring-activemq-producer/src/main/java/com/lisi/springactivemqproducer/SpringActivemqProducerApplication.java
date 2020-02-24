package com.lisi.springactivemqproducer;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.ConnectionFactory;

@SpringBootApplication
public class SpringActivemqProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringActivemqProducerApplication.class, args);
    }


//    @Bean
//    public ConnectionFactory connectionFactory(){
//        System.out.println("aaaaaaaaaaaaaaaaaaaaaa");
//        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
//        connectionFactory.setBrokerURL("tcp://localhost:61616");
//        connectionFactory.setUserName("admin");
//        connectionFactory.setPassword("admin");
//        return connectionFactory;
//    }
//    @Bean
//    public JmsTemplate genJmsTemplate(){
//        System.out.println("aaaaaaaaaaaaaaaaaaaaaabbbbbbbbb");
//        return new JmsTemplate(connectionFactory());
//
//    }
//    @Bean
//    public JmsMessagingTemplate jmsMessageTemplate(){
//        System.out.println("ccccccccccccc");
//        return new JmsMessagingTemplate(connectionFactory());
//
//    }

}
