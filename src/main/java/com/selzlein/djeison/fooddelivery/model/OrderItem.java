package com.selzlein.djeison.fooddelivery.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.selzlein.djeison.fooddelivery.app.model.Model;

import lombok.Getter;

@Entity
@Table(name = "order_items")
@Getter
public class OrderItem implements Model {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	private Order order;

	@ManyToOne(fetch = FetchType.LAZY)
	private Item item;

	private BigDecimal unitPrice;

	private BigDecimal quantity;

}
