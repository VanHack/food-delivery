package com.selzlein.djeison.fooddelivery.order.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selzlein.djeison.fooddelivery.app.web.ControllerDefault;
import com.selzlein.djeison.fooddelivery.order.model.Order;
import com.selzlein.djeison.fooddelivery.order.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController extends ControllerDefault<Order, OrderService> {

}
