package com.travel.service;

import java.util.List;

import com.travel.model.Path;

public interface PathService {
	public int insert(Path path);

	public List<Path> getList();

	public int delete(int id);

	public Path findById(int id);

	public int update(Path path);
	
	public Path selectByRouteId(int routeId);
}
