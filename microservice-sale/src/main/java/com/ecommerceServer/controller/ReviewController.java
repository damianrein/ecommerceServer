package com.ecommerceServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceServer.model.Review;
import com.ecommerceServer.service.ReviewService;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

	private final ReviewService service;

	public ReviewController(@Autowired ReviewService service) {
		this.service = service;
	}
	
	@PostMapping("/")
	public ResponseEntity<Void> atReview(@RequestBody Review r){
		service.createReview(r);
		return ResponseEntity.status(201).build();
	}
	
	@GetMapping("/{productId}")
	public ResponseEntity<List<Review>> reviewsByProduct(@PathVariable Long productId){
		return ResponseEntity.ok(service.productReviews(productId));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteReviewById(@PathVariable String id){
		service.deleteOneById(id);
		return ResponseEntity.noContent().build();
	}
}
