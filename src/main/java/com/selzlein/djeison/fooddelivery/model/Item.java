package com.selzlein.djeison.fooddelivery.model;

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
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.selzlein.djeison.fooddelivery.app.model.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "items")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Item implements Model {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Size(max = 50)
	private String name;

	@Size(max = 150)
	private String description;

	@NotNull
	@DecimalMin(value = "0.01")
	private BigDecimal price;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Restaurant restaurant;

}
