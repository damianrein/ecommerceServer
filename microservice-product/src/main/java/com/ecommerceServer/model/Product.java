package com.ecommerceServer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "The name of the product is missing")
	private String name;
	@NotNull(message = "This field cannot be null")
	@Min(value = 0, message = "Stock cannot be less than zero")
	private Integer stock;
	@NotBlank(message = "The product description is missing")
	private String description;
	@NotNull(message = "This field cannot be null")
	@Min(value = 0, message = "Price cannot be less than zero")
	private Double price;
}
