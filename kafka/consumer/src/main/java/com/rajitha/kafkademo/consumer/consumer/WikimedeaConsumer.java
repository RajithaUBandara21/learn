package com.rajitha.kafkademo.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikimedeaConsumer {
    @KafkaListener(topics = "wikimedia-stream-topic" , groupId = "myGroup")
    public void consume(String message) {

        log.info("Consuming message form wikimedia stream topic: " + message);
    }
}
