package com.selzlein.djeison.fooddelivery.service;

import org.springframework.stereotype.Service;

import com.selzlein.djeison.fooddelivery.app.service.ServiceDefault;
import com.selzlein.djeison.fooddelivery.model.OrderItem;
import com.selzlein.djeison.fooddelivery.model.OrderItemRepository;

@Service
public class OrderItemService extends ServiceDefault<OrderItem, OrderItemRepository> {

}
