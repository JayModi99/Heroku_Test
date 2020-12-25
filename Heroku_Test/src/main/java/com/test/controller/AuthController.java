package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Auth;
import com.test.service.AuthService;

@RestController
@RequestMapping("api/vi/auth")
public class AuthController {
	
	@Autowired
	AuthService authService;
	
	@PostMapping("save")
	public Auth saveUser(@RequestBody Auth auth) {
		return authService.saveUser(auth);
	}
	
	@GetMapping("getAll")
	public List<Auth> getAllUsers(){
		return authService.getAllUsers();
	}

}
