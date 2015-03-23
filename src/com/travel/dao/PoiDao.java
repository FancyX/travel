package com.travel.dao;

import java.util.List;

import com.travel.model.Poi;

public interface PoiDao {

	public int deleteById(int id);

	public int insert(Poi poi);

	public Poi selectById(int id);

	public int update(Poi poi);

	public List<Poi> getList();
	
	public List<Poi> getListByRouteId(int routeId);
}
