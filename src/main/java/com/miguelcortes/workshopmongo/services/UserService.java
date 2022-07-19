package com.miguelcortes.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguelcortes.workshopmongo.domain.User;
import com.miguelcortes.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
}
