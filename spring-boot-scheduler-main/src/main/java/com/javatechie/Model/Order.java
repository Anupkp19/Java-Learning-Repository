package com.javatechie.Model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="COLUMN_DB")
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int qty;
    private int price;

    public Order(String name, int qty, int price){
        this.name=name;
        this.price=price;
        this.qty=qty;

    }
}
