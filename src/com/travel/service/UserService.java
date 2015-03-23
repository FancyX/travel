package com.travel.service;

import java.util.List;

import com.travel.model.User;

public interface UserService {
	public int insert(User user);

	public List<User> getList();

	public int delete(int id);

	public User findById(int id);

	public int update(User user);
}
