package com.xxm.springcloudstudy.rabbitmqstudy.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Xiaoming Xu
 * @date 2019/8/13
 */
@Component
@RabbitListener(queues = "orderQueue")
public class Receiver {
    private static final Logger log = LoggerFactory.getLogger(Receiver.class);

    @RabbitHandler
    public void process(String hello) {
        log.info("receiver orderNumber: {}", hello);
    }
}
