package com.miternos.sbexample.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaTrxLogProducer {

    @Value("${kafka.trx.log.topic:test}")
    private String topic;


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String log){
        kafkaTemplate.send(topic,log);
    }


}
