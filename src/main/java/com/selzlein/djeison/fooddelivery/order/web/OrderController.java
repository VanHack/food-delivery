package com.selzlein.djeison.fooddelivery.order.web;

import org.springframework.stereotype.Controller;

import com.selzlein.djeison.fooddelivery.app.web.ControllerDefault;
import com.selzlein.djeison.fooddelivery.order.model.Order;
import com.selzlein.djeison.fooddelivery.order.service.OrderService;

@Controller
public class OrderController extends ControllerDefault<Order, OrderService> {

}
