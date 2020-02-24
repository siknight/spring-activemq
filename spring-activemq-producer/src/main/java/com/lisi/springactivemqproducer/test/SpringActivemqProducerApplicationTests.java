package com.lisi.springactivemqproducer.test;


import com.lisi.springactivemqproducer.SpringActivemqProducerApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

@SpringBootTest(classes =SpringActivemqProducerApplication.class)
@RunWith(SpringRunner.class)
class SpringActivemqProducerApplicationTests {

//    @Autowired
//    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private JmsTemplate jmsTemplate;

//    @Autowired
//    private Queue queue;

    @Test
    void sendmessage() {
        jmsTemplate.send("test", new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {

                TextMessage textMessage = session.createTextMessage();
                String msg="hello activemq";
                textMessage.setText(msg);
                return textMessage;
            }
        });


//        jmsTemplate.convertAndSend(queue,"hello activemq");

    }


}
