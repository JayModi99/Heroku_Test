package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.Auth;

@Repository
public interface AuthRepository extends JpaRepository<Auth, Long> {

}
