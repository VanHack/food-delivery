package com.selzlein.djeison.fooddelivery.order.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.selzlein.djeison.fooddelivery.app.model.Model;
import com.selzlein.djeison.fooddelivery.item.model.Item;
import com.selzlein.djeison.fooddelivery.item.service.ItemIdSerializer;
import com.selzlein.djeison.fooddelivery.order.service.OrderIdSerializer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order_items")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem implements Model {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonSerialize(using = OrderIdSerializer.class)
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Order order;

	@JsonSerialize(using = ItemIdSerializer.class)
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Item item;

	@NotNull
	@DecimalMin(value = "0.1")
	private BigDecimal unitPrice;

	@NotNull
	@DecimalMin(value = "0.1")
	private BigDecimal quantity;

	public BigDecimal total() {
		return quantity.multiply(unitPrice);
	}

}
