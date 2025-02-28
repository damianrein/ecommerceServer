package com.ecommerceServer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerceServer.model.Review;
import com.ecommerceServer.repository.IReviewRepository;

@Service
public class ReviewService {

	private final IReviewRepository repo;

	public ReviewService(@Autowired IReviewRepository repo) {
		this.repo = repo;
	}
	
	public List<Review> productReviews(Long id){
		return repo.findByProductId(id);
	}
}
