package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {
	
	public UserEntity findByEmailAndPwd(String email,String Pwd);
	public UserEntity findByEmail(String email);

}