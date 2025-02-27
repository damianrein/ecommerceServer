package com.ecommerceServer.model;

import java.math.BigDecimal;

public record OrderItem(String name, Integer quality, String description, BigDecimal price) {

	
}
