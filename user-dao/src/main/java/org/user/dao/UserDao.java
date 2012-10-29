package org.user.dao;

import java.util.List;

import org.user.model.User;

public interface UserDao {
	
	List<User> listAll();
	
	User findById(int id);
	
	void save(User user);
	
	void delete(User user);
	
}
