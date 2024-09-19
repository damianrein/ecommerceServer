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
	
	public Product(Long id, @NotBlank(message = "The name of the product is missing") String name,
			@NotNull(message = "This field cannot be null") @Min(value = 0, message = "Stock cannot be less than zero") Integer stock,
			@NotBlank(message = "The product description is missing") String description,
			@NotNull(message = "This field cannot be null") @Min(value = 0, message = "Price cannot be less than zero") Double price) {
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.description = description;
		this.price = price;
	}
	
	public Product( @NotBlank(message = "The name of the product is missing") String name,
			@NotNull(message = "This field cannot be null") @Min(value = 0, message = "Stock cannot be less than zero") Integer stock,
			@NotBlank(message = "The product description is missing") String description,
			@NotNull(message = "This field cannot be null") @Min(value = 0, message = "Price cannot be less than zero") Double price) {
		this.name = name;
		this.stock = stock;
		this.description = description;
		this.price = price;
	}
	
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
