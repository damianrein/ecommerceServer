package com.ecommerceServer.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.ecommerceServer.dtos.SaleDto;
import com.ecommerceServer.model.Sale;
import com.ecommerceServer.repository.ISaleRepository;

@Service
public class SaleService {

	private ISaleRepository repo;
	
	public void newSale(SaleDto dto) {
		Sale newSale = new Sale();
		newSale.setUserId(dto.getUserId());
		newSale.setProducts(dto.getProducts());
		newSale.setSaleDate(LocalDate.now());
		newSale.setTotal(null);
	}
}
