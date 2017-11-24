package com.selzlein.djeison.fooddelivery.web;

import org.springframework.stereotype.Controller;

import com.selzlein.djeison.fooddelivery.app.controller.ControllerDefault;
import com.selzlein.djeison.fooddelivery.model.Order;
import com.selzlein.djeison.fooddelivery.service.OrderService;

@Controller
public class OrderController extends ControllerDefault<Order, OrderService> {

}
