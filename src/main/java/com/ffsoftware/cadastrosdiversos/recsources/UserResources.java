package com.ffsoftware.cadastrosdiversos.recsources;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ffsoftware.cadastrosdiversos.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Flavio", "flavio.r.sn@gmail.com", "86986017727", "passwd");
		return ResponseEntity.ok(u);
	}
}
