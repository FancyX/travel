package com.travel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.UserDao;
import com.travel.model.User;
import com.travel.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public int insert(User user) {

		return userDao.insert(user);
	}

	public List<User> getList() {

		return userDao.getList();
	}

	public int delete(int id) {

		return userDao.deleteById(id);
	}

	public User findById(int id) {

		return userDao.selectById(id);
	}

	public int update(User user) {

		return userDao.update(user);
	}

}
