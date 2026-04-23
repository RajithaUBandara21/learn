package com.rajitha.kafkademo.consumer.consumer;

import com.rajitha.kafkademo.consumer.publisher.MessagePublisher;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class WikimedeaConsumer {
    private final MessagePublisher publisher;


    @KafkaListener(topics = "wikimedia-stream-topic" , groupId = "myGroup")
    public void consume(String message) {

        log.info("Consuming message form wikimedia stream topic: " + message);
        publisher.sendData(message);
    }
}
