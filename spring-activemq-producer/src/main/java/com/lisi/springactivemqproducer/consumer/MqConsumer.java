package com.lisi.springactivemqproducer.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MqConsumer {
    /**
     * 客户端消费
     * @param consumer
     */
    @JmsListener(destination = "test")
    public void receiveQueue(String consumer) {
        System.out.println(consumer+"消息已经消费了");
    }

}
