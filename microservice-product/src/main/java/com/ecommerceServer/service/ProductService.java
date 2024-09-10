package com.ecommerceServer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerceServer.dtos.ProductDto;
import com.ecommerceServer.model.Product;
import com.ecommerceServer.repository.IProductRepository;

@Service
public class ProductService {

	private IProductRepository repo;
	
	public void createProduct(ProductDto dto) {
		repo.save(new Product(dto.name(),dto.stock(),dto.description(),dto.price()));
	}
	
	public void deleteProductById(Long id) {
		repo.deleteById(id);
	}
	
	public List<Product> getAllProducts() {
		return repo.findAll();
	}
	
	
}
