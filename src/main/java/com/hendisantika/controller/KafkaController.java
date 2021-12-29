package com.hendisantika.controller;

import com.hendisantika.service.KafkaPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-kafka-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 30/12/21
 * Time: 06.51
 */
@RestController
@RequestMapping(value = "/api/kafka")
public class KafkaController {
    private static final Logger LOG = LoggerFactory.getLogger(KafkaController.class);
    private final KafkaPublisher kafkaPublisher;

    @Autowired
    public KafkaController(KafkaPublisher kafkaPublisher) {
        this.kafkaPublisher = kafkaPublisher;
    }

}
