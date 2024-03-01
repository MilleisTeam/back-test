package fr.milleis.testback.usecase.service;

import org.springframework.stereotype.Service;

import fr.milleis.testback.usecase.dto.User;

@Service
public class UserService {

	/**
	 * check if name not empty
	 * check if email not empty
	 * check if id not empty
	 * 
	 * @param user
	 */
	public void checkUser(User user) {
		throw new UnsupportedOperationException("Unimplemented method 'checkUser'");
	}

}
