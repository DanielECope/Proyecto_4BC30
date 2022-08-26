package pe.com.nttdata.AppMovil_Yanki.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.tomcat.util.json.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import pe.com.nttdata.AppMovil_Yanki.model.Item;
import pe.com.nttdata.AppMovil_Yanki.model.Purse;
import pe.com.nttdata.AppMovil_Yanki.service.IPurseService;
import pe.com.nttdata.AppMovil_Yanki.service.impl.PurseImpl;

@Component
public class KafkaStringConsumer {

    @Autowired
            private IPurseService service;

    Logger logger = LoggerFactory.getLogger(KafkaStringConsumer.class);

    @KafkaListener(topics = "bootcamp-topic" , groupId = "group_id")
    public void consume(String message) throws JsonProcessingException {
        logger.info("Consuming Message {}", message);
        Item data = new ObjectMapper().readValue(message, Item.class);
        if (data.getMethod().equals("insert")){
            logger.info(data.getData().getEmail());
            logger.info(data.getData().getImei());
            logger.info(data.getData().getPhoneNumber());
            service.insert(data.getData());
            //logger.info(data.getData().getRegisterDate().toString());
        }
    }


}