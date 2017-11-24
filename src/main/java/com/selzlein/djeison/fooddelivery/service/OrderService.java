package com.selzlein.djeison.fooddelivery.service;

import org.springframework.stereotype.Service;

import com.selzlein.djeison.fooddelivery.app.service.ServiceDefault;
import com.selzlein.djeison.fooddelivery.model.OrderRepository;
import com.selzlein.djeison.fooddelivery.model.Order;

@Service
public class OrderService extends ServiceDefault<Order, OrderRepository> {

}
