package com.miguelcortes.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.miguelcortes.workshopmongo.domain.User;
import com.miguelcortes.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// Faz a limpeza do repositório, antes de instanciar os objetos
		userRepository.deleteAll();
		
		User us1 = new User(null, "Maya Cortes", "maynha@gmail.com");
		User us2 = new User(null, "Bruce Wayne", "batman@gotham.com");
		User us3 = new User(null, "Peter Parker", "spider@gmail.com");
		
		userRepository.saveAll(Arrays.asList(us1, us2, us3));
	}
	
}
