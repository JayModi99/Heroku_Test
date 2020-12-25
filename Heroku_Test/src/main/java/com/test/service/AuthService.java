package com.test.service;

import java.util.List;

import com.test.model.Auth;

public interface AuthService {
	
	public Auth saveUser(Auth auth);
	
	public List<Auth> getAllUsers();

}
