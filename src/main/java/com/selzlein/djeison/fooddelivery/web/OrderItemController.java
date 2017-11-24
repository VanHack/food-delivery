package com.selzlein.djeison.fooddelivery.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selzlein.djeison.fooddelivery.app.controller.ControllerDefault;
import com.selzlein.djeison.fooddelivery.model.OrderItem;
import com.selzlein.djeison.fooddelivery.service.OrderItemService;

@RestController
@RequestMapping("/order-items")
public class OrderItemController extends ControllerDefault<OrderItem, OrderItemService> {

}
