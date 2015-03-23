package com.travel.dao;

import java.util.List;

import com.travel.model.RouteInfo;

public interface RouteInfoDao {

	public int deleteById(int id);

	public int insert(RouteInfo routeInfo);

	public RouteInfo selectById(int id);

	public int update(RouteInfo routeInfo);

	public List<RouteInfo> getList();

}
