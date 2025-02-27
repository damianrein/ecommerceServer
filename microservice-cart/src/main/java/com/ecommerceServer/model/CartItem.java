package com.ecommerceServer.model;

import java.math.BigDecimal;

public record CartItem(	String name, Integer quality, String description, BigDecimal price) {

}
