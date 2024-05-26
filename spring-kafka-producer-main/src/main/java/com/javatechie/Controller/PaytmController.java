package com.javatechie.Controller;

import com.javatechie.Dto.PaymentRequest;
import com.javatechie.Dto.PaytmPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

@RestController
public class PaytmController {

    @Value("${paytm.producer.topic.name}")
    private String topic;

    @Autowired
  private KafkaTemplate<String, Object>KafkaTemplate ;

    @GetMapping("/publish/{message}")
    public void first_message(@PathVariable  String message){
        KafkaTemplate.send("try",message);
    }

    @PostMapping("/post")
    public PaytmPayment doPayment(@RequestBody PaymentRequest<PaytmPayment>paymentRequest){
        PaytmPayment  paymentrequest = paymentRequest.getPayload();
        paymentrequest.setTranscationId(UUID.randomUUID().toString());
        paymentrequest.setDate(new Date());
        KafkaTemplate.send(topic, paymentrequest);
        return paymentrequest;
    }
}
