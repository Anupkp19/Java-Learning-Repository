//package com.javatechie.Controller;
//
//import com.javatechie.Model.Order;
//import com.javatechie.Repository.OrderRepository;
//import com.javatechie.Service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.PostConstruct;
//
//@RestController
//@RequestMapping("/app")
//public class OrderController {
//    @Autowired
//    OrderService repository;
//
//    @PostMapping("/order")
//    public Order saveOrder(Order order){
//      return repository.saveOrder(order);
//    }
//
//}
