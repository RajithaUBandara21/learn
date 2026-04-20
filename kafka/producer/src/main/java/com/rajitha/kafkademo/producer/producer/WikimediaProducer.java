package com.rajitha.kafkademo.producer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class WikimediaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate ;

    public void send(String message) {
        log.info("send message to consumer topic is wikimedia-stream-topic: {}", message);
        kafkaTemplate.send("wikimedia-stream-topic", message);
    }

}
