package ru.itpark.userservice.infrastructure.config.kafka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import ru.itpark.proto.ExampleRequest;
import ru.itpark.userservice.infrastructure.config.kafka.base.DefaultKafkaConfig;

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

