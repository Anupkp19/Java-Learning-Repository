package com.javatechie.Service;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.Date;

@Service
public class JobService {

@Autowired
    NotificationService service;


@Scheduled(cron = "${cron_interval}")
    public void process() {

    System.out.println("order is"+ new Date());
    try {
        service.sendDailyReports();
    } catch (MessagingException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}

}


