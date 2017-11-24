package com.selzlein.djeison.fooddelivery.order.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selzlein.djeison.fooddelivery.app.web.ControllerDefault;
import com.selzlein.djeison.fooddelivery.order.model.OrderItem;
import com.selzlein.djeison.fooddelivery.order.service.OrderItemService;

@RestController
@RequestMapping("/order-items")
public class OrderItemController extends ControllerDefault<OrderItem, OrderItemService> {

}
