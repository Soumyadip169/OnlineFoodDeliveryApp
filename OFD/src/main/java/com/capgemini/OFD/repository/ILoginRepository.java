package com.capgemini.OFD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.OFD.domain.Login;

/**
 * This is the ILoginRepository
 * @author Soumyadip
 *
 */
@Repository
public interface ILoginRepository extends JpaRepository<Login, Integer> {
	
	public Login signIn(Login login);
	public Login signOut(Login login);
}
