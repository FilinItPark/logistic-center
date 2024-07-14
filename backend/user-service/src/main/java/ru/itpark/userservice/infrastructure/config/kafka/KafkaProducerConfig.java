/*
package ru.itpark.userservice.infrastructure.config.kafka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import ru.itpark.proto.ExampleRequest;
import ru.itpark.userservice.infrastructure.config.kafka.base.DefaultKafkaConfig;


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

*/
