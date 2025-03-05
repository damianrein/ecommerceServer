package com.ecommerceServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceServer.service.StripeService;

@RestController
@RequestMapping("/stripe")
public class StripeController {

	private StripeService service;

	public StripeController(@Autowired StripeService service) {
		this.service = service;
	}
	
	
}
