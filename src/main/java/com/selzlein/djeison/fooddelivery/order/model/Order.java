package com.selzlein.djeison.fooddelivery.order.model;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.selzlein.djeison.fooddelivery.app.model.Model;
import com.selzlein.djeison.fooddelivery.customer.model.Customer;
import com.selzlein.djeison.fooddelivery.restaurant.model.Restaurant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Model {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDateTime dateTime;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Customer customer;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Restaurant restaurant;

	@OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<OrderItem> items;

}
