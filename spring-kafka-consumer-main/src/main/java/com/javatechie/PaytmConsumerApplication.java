package com.javatechie;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javatechie.Dto.PaymentRequest;
import com.javatechie.Dto.PaytmPayment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
public class PaytmConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaytmConsumerApplication.class, args);
    }

    @KafkaListener(topics = "payment-topic", groupId = "Payment_consumer_group")
    public void paymentConsumer1(PaytmPayment paymentRequest) {
        try {
            // Business logic
            log.info("paymentConsumer1 consumed message {} ", new ObjectMapper().writeValueAsString(paymentRequest));
        } catch (Exception ex) {
            log.error("Error processing message: {}", ex.getMessage(), ex);
            // Handle the exception appropriately, such as retrying or sending to a dead-letter queue
        }
    }

//    @KafkaListener(topics = "PAYMENT_TOPIC2", groupId = "Payment_consumer_group")
//    public void paymentConsumer2(PaymentRequest paymentRequest) throws JsonProcessingException {
//        //business logic
//        log.info("paymentConsumer2 consumed message {} ", new ObjectMapper().writeValueAsString(paymentRequest));
//    }
//
//    @KafkaListener(topics = "PAYMENT_TOPIC2", groupId = "Payment_consumer_group")
//    public void paymentConsumer3(PaymentRequest paymentRequest) throws JsonProcessingException {
//        //business logic
//        log.info("paymentConsumer3 consumed message {} ", new ObjectMapper().writeValueAsString(paymentRequest));
//    }
//
//    @KafkaListener(topics = "PAYMENT_TOPIC2", groupId = "Payment_consumer_group")
//    public void paymentConsumer4(PaymentRequest paymentRequest) throws JsonProcessingException {
//        //business logic
//        log.info("paymentConsumer4 consumed message {} ", new ObjectMapper().writeValueAsString(paymentRequest));
//    }

//3
//  3 c i
// 4

    // p-> 1 partitions
    //consumer instance ?
}
