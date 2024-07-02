package ru.itpark.userservice.infrastructure.config.kafka;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;
import ru.itpark.proto.ExampleRequest;
import ru.itpark.userservice.infrastructure.config.kafka.base.DefaultKafkaConfig;

import java.util.HashMap;
import java.util.Map;


@Configuration
public class KafkaProducerConfig extends DefaultKafkaConfig {

    @Bean
    public KafkaTemplate<String, ExampleRequest> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }

    public DefaultKafkaProducerFactory<String, ExampleRequest> producerFactory() {
        return new DefaultKafkaProducerFactory<>(getProducerProps());
    }
}

