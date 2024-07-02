package ru.itpark.userservice.infrastructure.config.kafka;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import ru.itpark.proto.ExampleRequest;
import ru.itpark.userservice.infrastructure.config.kafka.base.DefaultKafkaConfig;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 1ommy
 * @version 01.04.2023
 */
@Configuration
public class KafkaConsumerConfig  extends DefaultKafkaConfig {
    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, ExampleRequest> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, ExampleRequest> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConcurrency(1);
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }

    @Bean
    public ConsumerFactory<String, ExampleRequest> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(getConsumerProps());
    }
}

