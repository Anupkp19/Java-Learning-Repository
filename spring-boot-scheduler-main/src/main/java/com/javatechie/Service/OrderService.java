package com.javatechie.Service;

import com.javatechie.Model.Order;
import com.javatechie.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class OrderService {

@Autowired
private OrderRepository repository;


@PostConstruct
    public void initialData(){
    List<Order> orderList = IntStream.rangeClosed(1,20).mapToObj(i-> new Order("order"+i,new Random().nextInt(5), new Random().nextInt(500))).collect(Collectors.toList());
    repository.saveAll(orderList);
}

    public Order saveOrder(Order order) {
        return repository.save(order);
    }
}
