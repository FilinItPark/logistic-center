package ru.itpark.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(UserServiceApplication.class, args);
    }

   /* @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, ExampleRequest> template) {
        return args -> {
            template.send("test", ExampleRequest.newBuilder()
                    .setName("hello")
                    .build());
            System.out.println("Hello World!");
        };
    }

    @KafkaListener(topics = {"test"}, groupId = "myGroup", containerFactory = "kafkaListenerContainerFactory")
    public void listen(@Payload ConsumerRecord<String, ExampleRequest> message) {
        System.out.println("Received: " + message.value().getName());
    }*/

}
