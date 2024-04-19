package com.example.Application.service;

import java.util.List;

import com.example.Application.entity.User;

public interface UserService {
	
	 User createUser(User user);
	 User updateUser(int Id, User user);
	 void deleteUser(int Id);
	 User getUserById(int Id);
	 
	 List<User>getAllUsers();

}
