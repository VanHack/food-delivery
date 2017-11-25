package com.selzlein.djeison.fooddelivery.order.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.selzlein.djeison.fooddelivery.app.service.ServiceDefault;
import com.selzlein.djeison.fooddelivery.order.model.Order;
import com.selzlein.djeison.fooddelivery.order.model.OrderRepository;

@Service
public class OrderService extends ServiceDefault<Order, OrderRepository> {

	@Override
	public Collection<Order> findAll() {
		return repository.findAll();
	}

}
