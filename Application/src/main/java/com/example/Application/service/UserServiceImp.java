package com.example.Application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Application.entity.User;
import com.example.Application.exception.UserExp;
import com.example.Application.repo.UserRepository;

public class UserServiceImp implements UserService {
	@Autowired
	private UserRepository userRepository = null;
	
	

	public UserServiceImp(UserRepository userRepository) {
		
		this.userRepository=userRepository;
	}
	
	public List<User>getAll(){
		return userRepository.findAll();
		}

	@Override
	public User createUser(User user) {
		if (getUserById(user.getId())!=null) {
			
			throw new UserExp("Error occured because it already exists");
		}
		userRepository.save(user);
		return user;
		
	}

	@Override
	public User updateUser(int Id, User user) {
		User userUP=userRepository.findById(Id).orElseThrow(()-> new UserExp("User not Found"));
		
		userUP.setUsername(user.getUsername());
		userUP.setEmail(user.getEmail());
		return userRepository.save(userUP);
	}

	@Override
	public void deleteUser(int Id) {
		User delUse=getUserById(Id);
		userRepository.delete(delUse);
		
	}

	@Override
	public User getUserById(int Id) {
		
		return userRepository.findById(Id).orElseThrow(()-> new UserExp("User not Found"));
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
