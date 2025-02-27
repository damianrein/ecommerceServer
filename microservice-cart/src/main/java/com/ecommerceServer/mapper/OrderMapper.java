package com.ecommerceServer.mapper;

import java.math.BigDecimal;
import java.util.List;

import com.ecommerceServer.model.Cart;
import com.ecommerceServer.model.CartItem;
import com.ecommerceServer.model.Order;
import com.ecommerceServer.model.OrderItem;

public class OrderMapper {

	public static OrderItem toOrderItem(CartItem i) {
		return new OrderItem(i.name(), i.quality(), i.description(), i.price());
	}
	
	public static List<OrderItem> toOrderItems(List<CartItem> items){
		return items.stream().map(i->toOrderItem(i)).toList();
	}
	
	public static Order toOrder(Cart c) {
		Order o = new Order();
		o.setUserId(c.getUserId());
		o.setItems(toOrderItems(c.getItems()));
		o.setTotalAmount(calculateTotal(c.getItems()));
		//o.setTotalAmount(c.getTotalAmount());
		return o;
	}
	
	private static BigDecimal calculateTotal(List<CartItem> items) {
		return items.stream().map(i->priceForItems(i)).reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	
	private static BigDecimal priceForItems(CartItem i) {
		BigDecimal total = BigDecimal.ZERO;
		BigDecimal q = new BigDecimal(i.quality());
		BigDecimal p = i.price();
		total = (p.multiply(q));
		return total;
	}
}
