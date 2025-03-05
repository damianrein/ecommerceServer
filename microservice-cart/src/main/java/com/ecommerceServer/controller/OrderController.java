package com.ecommerceServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceServer.model.Cart;
import com.ecommerceServer.service.OrderService;

@RestController
@RequestMapping("/ordes")
public class OrderController {

	private final OrderService service;

	public OrderController(@Autowired OrderService service) {
		this.service = service;
	}
	
	@PostMapping("/")
	public ResponseEntity<?> createOrder(@RequestBody Cart c){
		service.upOrder(c);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
