package pe.com.nttdata.AppMovil_Producer.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import pe.com.nttdata.AppMovil_Producer.model.Purse;

import java.time.LocalDateTime;

@Component
public class KafkaStringProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaStringProducer.class);

    private final KafkaTemplate<String, Object> kafkaTemplate;
    //private final KafkaTemplate<String, Purse> kafkaPurse;

    public KafkaStringProducer(@Qualifier("kafkaStringTemplate") KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        LOGGER.info("Producing message {}", message);
        this.kafkaTemplate.send("bootcamp-topic", message);
    }

    public void sendPurse(Purse obj) {
        obj.setRegisterDate(LocalDateTime.now());
        LOGGER.info("Producing message {}", obj.toString());
        this.kafkaTemplate.send("bootcamp-topic", obj);
    }

}