package com.travel.service;

import java.util.List;

import com.travel.model.RouteInfo;

public interface RouteInfoService {
	public int insert(RouteInfo routeInfo);

	public List<RouteInfo> getList();

	public int delete(int id);

	public RouteInfo findById(int id);

	public int update(RouteInfo routeInfo);
}
