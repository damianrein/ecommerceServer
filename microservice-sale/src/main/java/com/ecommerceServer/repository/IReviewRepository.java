package com.ecommerceServer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceServer.enums.Valoration;
import com.ecommerceServer.model.Review;

public interface IReviewRepository extends JpaRepository<Review, String>{

	List<Review> findByUserId(Long userId);
	List<Review> findByProductId(Long productId);
	List<Review> findByValoration(Valoration valoration);
}
