package com.ecommerceServer.service;

import org.springframework.stereotype.Service;

import com.ecommerceServer.repository.ICartRepository;

@Service
public class CartService {

	private ICartRepository repo;

	public CartService(ICartRepository repo) {
		this.repo = repo;
	}
	
	
}
