package com.ecommerceServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerceServer.model.UserEntity;

public interface IUserEntityRepository extends JpaRepository<UserEntity, Long>{

	UserEntity findByEmail(String email);
}
