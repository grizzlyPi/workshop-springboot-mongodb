package com.udemy.workshopmongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.workshopmongodb.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = new ArrayList<>();
		
		User u1 = new User("1", "Lucas", "lucas@gmail.com");
		User u2 = new User("2", "Maria", "maria@gmail.com");
		list.addAll(Arrays.asList(u1, u2));
		
		return ResponseEntity.ok().body(list);	
	}
}