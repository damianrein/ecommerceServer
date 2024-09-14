package com.ecommerceServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceServer.model.Cart;

public interface ICartRepository extends JpaRepository<Cart, Long>{

}
