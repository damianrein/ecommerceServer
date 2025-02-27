package com.ecommerceServer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerceServer.mapper.OrderMapper;
import com.ecommerceServer.model.Cart;
import com.ecommerceServer.model.Order;
import com.ecommerceServer.repository.IOrderRepository;

@Service
public class OrderService {

	private final IOrderRepository repo;

	public OrderService(@Autowired IOrderRepository repo) {
		this.repo = repo;
	}
	
	public void upOrder(Cart c) {
		Order o = OrderMapper.toOrder(c);
		//Falta agregar que se guarde solo si el pago es exitoso
		
		repo.save(o);
	}
}
