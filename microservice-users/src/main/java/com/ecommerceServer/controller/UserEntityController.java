package com.ecommerceServer.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerceServer.model.UserEntity;
import com.ecommerceServer.service.UserEntityService;

@RestController
@RequestMapping("/v2")
public class UserEntityController {

	private UserEntityService service;
	
	public UserEntityController(UserEntityService service) {
		this.service = service;
	}
	
	@GetMapping("/")
	public ResponseEntity<List<UserEntity>> findAllUsers(){
		return ResponseEntity.ok(service.getAllUserEntitys());
	}
}
