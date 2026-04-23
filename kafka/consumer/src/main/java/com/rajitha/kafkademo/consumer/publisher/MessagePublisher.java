package com.rajitha.kafkademo.consumer.publisher;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessagePublisher {

    private final SimpMessagingTemplate template;

    public void sendData(String message) {
        template.convertAndSend("/topic/wikimedia", message);
    }
}