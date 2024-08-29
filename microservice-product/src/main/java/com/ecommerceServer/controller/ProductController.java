package com.ecommerceServer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceServer.dtos.ProductDto;
import com.ecommerceServer.service.ProductService;

@RestController
@RequestMapping("/v1")
public class ProductController {

	private ProductService service;

	public ProductController(ProductService service) {
		this.service = service;
	}
	
	@PostMapping("/")
	public ResponseEntity<?> createProduct(@RequestBody ProductDto dto){
		service.createProduct(dto);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteProductoById(@PathVariable Long id){
		service.deleteProductById(id);
		return ResponseEntity.noContent().build();
	}
}
