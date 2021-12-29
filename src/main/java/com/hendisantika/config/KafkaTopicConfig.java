package com.hendisantika.config;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-kafka-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 30/12/21
 * Time: 06.49
 */
@Configuration
public class KafkaTopicConfig {

    @Value(value = "${kafka.bootstrap.server}")
    private String kafkaBootstrapServer;

    @Value(value = "${kafka.topic.name}")
    private String topicName;

    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaBootstrapServer);
        return new KafkaAdmin(configs);
    }

    @Bean
    public NewTopic bookUpdateTopic() {
        return new NewTopic(topicName, 1, (short) 1);
    }
}
