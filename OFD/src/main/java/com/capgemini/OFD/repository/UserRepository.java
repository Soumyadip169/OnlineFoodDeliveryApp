package com.capgemini.OFD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.OFD.domain.Login;

public interface UserRepository extends JpaRepository<Login, Integer>{
	public Login findByUserName(String userName);
	public boolean existsByUserName(String userName);
}
