package com.ecommerceServer.model;

import java.time.LocalDateTime;

import com.ecommerceServer.enums.Valoration;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	@NotBlank
	private Long userId;
	@NotBlank
	private Long productId;
	@Column(updatable = false)
	private LocalDateTime creatAt;
	private String message;
	@Enumerated(EnumType.ORDINAL)
	@Column(updatable = false)
	@NotBlank
	private Valoration valoration;
	
	public Review() {}
	
	public Review(Long userId, Long productId, LocalDateTime creatAt, String message, Valoration valoration) {
		this.userId = userId;
		this.productId = productId;
		this.creatAt = creatAt;
		this.message = message;
		this.valoration = valoration;
	}
	public Review(String id, Long userId, Long productId, LocalDateTime creatAt, String message,
			Valoration valoration) {
		this.id = id;
		this.userId = userId;
		this.productId = productId;
		this.creatAt = creatAt;
		this.message = message;
		this.valoration = valoration;
	}

	public String getId() {
		return id;
	}
	public Long getUserId() {
		return userId;
	}
	public Long getProductId() {
		return productId;
	}
	public LocalDateTime getCreatAt() {
		return creatAt;
	}
	public String getMessage() {
		return message;
	}
	public Valoration getValoration() {
		return valoration;
	}
}
