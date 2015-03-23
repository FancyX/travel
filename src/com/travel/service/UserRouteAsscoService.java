package com.travel.service;

import java.util.List;

import com.travel.model.UserRouteAssco;

public interface UserRouteAsscoService {
	public int insert(UserRouteAssco userRouteAssco);

	public List<UserRouteAssco> getList();

	public int delete(int id);

	public UserRouteAssco findById(int id);

	public int update(UserRouteAssco userRouteAssco);
}
