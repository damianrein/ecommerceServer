package com.ecommerceServer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceServer.service.ProductService;

@RestController
@RequestMapping("/v1")
public class ProductController {

	private ProductService service;
}
