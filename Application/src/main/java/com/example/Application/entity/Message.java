package com.example.Application.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private User sender;
	
	@ManyToOne
	private User reciver;
	
	@OneToMany(mappedBy = "chatRoom")
	private List<Message> message;
	
	private String content;
	private LocalDateTime timestamp;

}
