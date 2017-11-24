package com.selzlein.djeison.fooddelivery.order.service;

import org.springframework.stereotype.Service;

import com.selzlein.djeison.fooddelivery.app.service.ServiceDefault;
import com.selzlein.djeison.fooddelivery.order.model.OrderItem;
import com.selzlein.djeison.fooddelivery.order.model.OrderItemRepository;

@Service
public class OrderItemService extends ServiceDefault<OrderItem, OrderItemRepository> {

}
