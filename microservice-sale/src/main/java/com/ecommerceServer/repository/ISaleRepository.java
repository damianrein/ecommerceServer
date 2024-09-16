package com.ecommerceServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceServer.model.Sale;

public interface ISaleRepository extends JpaRepository<Sale, Long> {

}
