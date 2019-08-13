package com.xxm.springcloudstudy.rabbitmqstudy.controller;

import com.xxm.springcloudstudy.rabbitmqstudy.mq.Sender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xiaoming Xu
 * @date 2019/8/13
 */
@RestController
@RequestMapping("mq")
public class MqController {
    private static final Logger log = LoggerFactory.getLogger(MqController.class);

    @Autowired
    private Sender sender;

    @RequestMapping("send")
    public String send() {
        sender.send();
        return "success";
    }
}
