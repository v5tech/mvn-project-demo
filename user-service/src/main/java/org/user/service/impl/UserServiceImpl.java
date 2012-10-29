package org.user.service.impl;

import java.util.List;

import org.user.dao.UserDao;
import org.user.model.User;
import org.user.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<User> listAll() {
		return userDao.listAll();
	}

	public User findById(int id) {
		return userDao.findById(id);
	}

	public void save(User user) {
		userDao.save(user);
	}

	public void delete(User user) {
		userDao.delete(user);	
	}
	
	
	
}
