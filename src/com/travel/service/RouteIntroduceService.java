package com.travel.service;

import java.util.List;
import java.util.Map;

import com.travel.model.RouteIntroduce;

public interface RouteIntroduceService {
	public int insert(RouteIntroduce routeIntroduce);

	public List<RouteIntroduce> getList();

	public int delete(int id);

	public RouteIntroduce findById(int id);

	public int update(RouteIntroduce routeIntroduce);

	public List<Map<String, Object>> selectPage(int curPage, int linePerPage,
			Map<String, Object> args);

	public Map<String, Object> selectByRouteId(int routeId);

	public int totlePage(int linePerPage, Map<String, Object> args);
}
