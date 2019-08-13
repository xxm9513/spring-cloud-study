package com.xxm.springcloudstudy.rabbitmqstudy.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Xiaoming Xu
 * @date 2019/8/13
 */
@Configuration
public class RabbitConfiguration {
    @Bean
    public Queue ueue() {
        return new Queue("orderQueue");
    }
}
