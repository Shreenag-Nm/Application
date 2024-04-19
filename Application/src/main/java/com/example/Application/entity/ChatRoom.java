package com.example.Application.entity;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Entity
@Data
public class ChatRoom {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	
	@ManyToMany
	private Set<User> Participants=new HashSet<>();
	
	@OneToMany (mappedBy = "chatRoom")
	private List<Message> message = new ArrayList<>();

}
