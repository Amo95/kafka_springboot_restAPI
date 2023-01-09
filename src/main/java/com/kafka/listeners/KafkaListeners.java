package com.kafka.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "jeimseu",
            groupId = "admin"
    )
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
