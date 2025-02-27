package com.ecommerceServer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceServer.model.Order;

public interface IOrderRepository extends JpaRepository<Order, Long>{

	List<Order> findByUserId(Long id);
}
