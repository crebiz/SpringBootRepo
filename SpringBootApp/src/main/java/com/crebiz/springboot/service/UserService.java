package com.crebiz.springboot.service;


import java.util.List;

import com.crebiz.springboot.model.User;

public interface UserService {
	
	User findById(Long id);

	User findByName(String name);
	
	User findByEmail(String email);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserById(Long id);

	void deleteAllUsers();

	List<User> findAllUsers();

	boolean isUserExist(User user);
}