package com.travel.dao;

import java.util.List;

import com.travel.model.User;

public interface UserDao {

	public int deleteById(int id);

	public int insert(User user);

	public User selectById(int id);

	public int update(User user);

	public List<User> getList();

}
