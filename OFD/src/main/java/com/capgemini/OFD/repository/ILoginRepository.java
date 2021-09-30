package com.capgemini.OFD.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.OFD.domain.Login;

/**
 * This is the ILoginRepository
 * @author Soumyadip
 *
 */
public interface ILoginRepository extends CrudRepository<Login, String> {
	
	public Login signIn(Login login);
	public Login signOut(Login login);
}
