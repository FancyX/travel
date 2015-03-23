package com.travel.dao;

import java.util.List;

import com.travel.model.Path;

public interface PathDao {

	public int deleteById(int id);

	public int insert(Path path);

	public Path selectById(int id);

	public int update(Path path);

	public List<Path> getList();
	
	public Path selectByRouteId(int routeId);
	
}
