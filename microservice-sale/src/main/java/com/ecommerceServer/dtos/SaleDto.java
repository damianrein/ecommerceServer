package com.ecommerceServer.dtos;

import java.util.List;

import com.ecommerceServer.model.Product;

public class SaleDto {

	private Long userId;
	private List<Product> products;
	
	public Long getUserId() {
		return userId;
	}
	public List<Product> getProducts() {
		return products;
	}
	
	public Double putTotal(List<Product> products){
		return null;
	}
}
