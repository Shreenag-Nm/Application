package com.example.Application.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Application.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	List<User>findByUsername(String username);
	List<User>findByEmail(String email);
	

}
