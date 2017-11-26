package com.selzlein.djeison.fooddelivery.order.model;

import java.math.BigDecimal;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class OrderTest {

	@Test
	public void shouldCalculateTotal() {
		OrderItem orderItemOne = OrderItem.builder().quantity(new BigDecimal(10)).unitPrice(new BigDecimal(5)).build();
		OrderItem orderItemTwo = OrderItem.builder().quantity(new BigDecimal(8)).unitPrice(new BigDecimal(2)).build();

		Order order = Order.builder().items(Stream.of(orderItemOne, orderItemTwo).collect(Collectors.toSet())).build();

		assertThat(order.total(), equalTo(new BigDecimal(66)));
	}

	@Test
	public void shouldCalculateTotalToZero() {
		Order order = Order.builder().build();

		assertThat(order.total(), equalTo(new BigDecimal(0)));
	}

}
