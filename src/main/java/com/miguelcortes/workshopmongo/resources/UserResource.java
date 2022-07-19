package com.miguelcortes.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.miguelcortes.workshopmongo.domain.User;

@RestController
@RequestMapping(value="users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User us1 = new User("1", "Maya Cortes", "maya_auau@gmail.com");
		User us2 = new User("2", "Bruce Wayne", "bw@gotham.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(us1, us2));
		return ResponseEntity.ok().body(list);
	}
}
