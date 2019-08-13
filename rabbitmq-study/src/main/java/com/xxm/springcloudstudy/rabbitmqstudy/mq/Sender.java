package com.xxm.springcloudstudy.rabbitmqstudy.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author Xiaoming Xu
 * @date 2019/8/13
 */
@Component
public class Sender {
    private static final Logger log = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String orderMessage = UUID.randomUUID().toString();
        log.info("send orderNumber: {}", orderMessage);
        amqpTemplate.convertAndSend("orderQueue", orderMessage);
    }
}
