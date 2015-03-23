package com.travel.dao;

import java.util.List;

import com.travel.model.UserRouteAssco;

public interface UserRouteAsscoDao {

	public int deleteById(int id);

	public int insert(UserRouteAssco userRouteAssco);

	public UserRouteAssco selectById(int id);

	public int update(UserRouteAssco userRouteAssco);

	public List<UserRouteAssco> getList();

}
