package com.ecommerceServer.model;

import java.math.BigDecimal;
import java.util.List;

public class Cart {

	private Long userId;
	private List<CartItem> items;
	private BigDecimal totalAmount;
	
	public Cart() {}
	
	public Cart(Long userId, List<CartItem> items, BigDecimal totalAmount) {
		this.userId = userId;
		this.items = items;
		this.totalAmount = totalAmount;
	}

	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public List<CartItem> getItems() {
		return items;
	}
	public void setItems(List<CartItem> items) {
		this.items = items;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
}
