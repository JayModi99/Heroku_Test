package com.test.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Auth;
import com.test.repository.AuthRepository;
import com.test.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {
	
	@Autowired
	AuthRepository authRepository;

	@Override
	public Auth saveUser(Auth auth) {
		return authRepository.save(auth);
	}

	@Override
	public List<Auth> getAllUsers() {
		return authRepository.findAll();
	}

}
