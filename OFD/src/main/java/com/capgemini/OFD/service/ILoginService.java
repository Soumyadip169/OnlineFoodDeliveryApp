package com.capgemini.OFD.service;

import com.capgemini.OFD.domain.Login;

/**
 * This ILoginService interface will hold the functionality of Login based Business Logic
 * @author Soumyadip
 */
public interface ILoginService {
	/**
	 * signIn function is used during sign-in
	 * signOut function is used during sign-out
	 * @param login
	 * @return login for successfull login else returns null
	 */
	Login signIn(Login login);
	Login signOut(Login login);
}
