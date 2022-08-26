package pe.com.nttdata.AppMovil_Producer.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.nttdata.AppMovil_Producer.model.Item;
import pe.com.nttdata.AppMovil_Producer.model.Purse;
import pe.com.nttdata.AppMovil_Producer.producer.KafkaStringProducer;


@RestController
@Slf4j
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final KafkaStringProducer kafkaStringProducer;

    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    KafkaController(KafkaStringProducer kafkaStringProducer) {
        this.kafkaStringProducer = kafkaStringProducer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        this.kafkaStringProducer.sendMessage(message);
    }
    @PostMapping(value = "/purse", consumes = {"application/json"},produces = {"application/json"})
    public void sendMessageToKafkaTopicPurse(@RequestBody Item obj) throws JsonProcessingException {
        log.info("controller datos::: "+obj.toString());
        try{
            String data=objectMapper.writeValueAsString(obj);
            this.kafkaStringProducer.sendMessage(data);
        }catch (Exception e){
            log.info("Error: "+e.getMessage());
        }

    }
}
