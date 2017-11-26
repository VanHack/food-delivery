package com.selzlein.djeison.fooddelivery.order.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.math.BigDecimal;

import org.junit.Test;

public class OrderItemTest {

	@Test
	public void shouldCalculateTotal() {
		OrderItem orderItem = OrderItem.builder().quantity(new BigDecimal(10)).unitPrice(new BigDecimal(5)).build();

		assertThat(orderItem.total(), equalTo(new BigDecimal(50)));
	}
	
	@Test
	public void shouldCalculateTotalToZero() {
		OrderItem orderItem = OrderItem.builder().quantity(new BigDecimal(0)).unitPrice(new BigDecimal(0)).build();

		assertThat(orderItem.total(), equalTo(new BigDecimal(0)));		
	}

}
