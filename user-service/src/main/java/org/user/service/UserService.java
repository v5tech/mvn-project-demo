package org.user.service;

import java.util.List;

import org.user.model.User;

public interface UserService {
	
	List<User> listAll();
	
	User findById(int id);
	
	void save(User user);
	
	void delete(User user);
}
