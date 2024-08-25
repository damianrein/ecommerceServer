package com.ecommerceServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceServer.model.Product;

public interface IProductRepository extends JpaRepository<Product, Long>{

}
