package com.ecommerceServer.controller;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/")
	public ResponseEntity<?> createUser(@RequestBody UserEntity user){
		service.createUserEntity(user);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@GetMapping("/{email}")
	public ResponseEntity<UserEntity> findByUserEmail(@Param(value = "email")String email){
		return ResponseEntity.ok(service.getUserEntityByEmail(email));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUserById(@PathVariable Long id){
		service.deleteUserEntity(id);
		return ResponseEntity.noContent().build();
	}
}
