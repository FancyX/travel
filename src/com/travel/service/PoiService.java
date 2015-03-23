package com.travel.service;

import java.util.List;

import com.travel.model.Poi;

public interface PoiService {
	public int insert(Poi poi);

	public List<Poi> getList();

	public int delete(int id);

	public Poi findById(int id);

	public int update(Poi poi);

	public List<Poi> getListByRouteId(int routeId);
}
