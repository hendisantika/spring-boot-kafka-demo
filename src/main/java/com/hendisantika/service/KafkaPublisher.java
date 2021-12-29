package com.hendisantika.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-kafka-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 30/12/21
 * Time: 06.49
 */
@Service
public class KafkaPublisher {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaPublisher.class);

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper obj;

    @Autowired
    public KafkaPublisher(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper obj) {
        this.kafkaTemplate = kafkaTemplate;
        this.obj = obj;
    }
}
