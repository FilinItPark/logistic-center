package ru.itpark.userservice.presentation.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import ru.itpark.userservice.domain.user.User;

@Service
@EnableKafka
public class KafkaUserListener {

    private static final Logger log = LoggerFactory.getLogger(KafkaUserListener.class);

    @KafkaListener(topics = "user-create", groupId = "userservice", containerFactory = "kafkaListenerContainerFactory")
    public void onMessage(@Payload ConsumerRecord<String, User> message) {
        log.info(message.value().toString());
    }
}
