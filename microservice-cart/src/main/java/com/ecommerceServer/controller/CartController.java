package com.ecommerceServer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceServer.service.CartService;

@RestController
@RequestMapping("/v7")
public class CartController {

	private CartService service;

	public CartController(CartService service) {
		this.service = service;
	}
	
	
}
