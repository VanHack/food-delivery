package com.selzlein.djeison.fooddelivery.order.model;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

	@EntityGraph(attributePaths = { "customer", "restaurant" })
	public List<Order> findAll();

}
