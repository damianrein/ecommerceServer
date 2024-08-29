package com.ecommerceServer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerceServer.model.UserEntity;
import com.ecommerceServer.repository.IUserEntityRepository;

@Service
public class UserEntityService {

	private IUserEntityRepository repo;

	public UserEntityService(IUserEntityRepository repo) {
		this.repo = repo;
	}
	
	public List<UserEntity> getAllUserEntitys(){
		return repo.findAll();
	}
	
	public UserEntity getUserEntityByEmail(String email) {
		return repo.findByEmail(email);
	}
	
	public void deleteUserEntity(Long id) {
		repo.deleteById(id);
	}
	
	public void createUserEntity(UserEntity user) {
		repo.save(user);
	}
}
