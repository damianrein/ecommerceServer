package com.ecommerceServer.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Product {

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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Long getId() {
		return id;
	}
}
