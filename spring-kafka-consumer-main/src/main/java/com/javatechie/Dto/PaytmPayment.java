package com.javatechie.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaytmPayment {

    private String transcationId;
    private String srcAc;
    private String destAc;
    private double amount;
    private Date date;


}
