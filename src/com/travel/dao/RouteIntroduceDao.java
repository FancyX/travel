package com.travel.dao;

import java.util.List;
import java.util.Map;

import com.travel.model.RouteIntroduce;

public interface RouteIntroduceDao {

	public int deleteById(int id);

	public int insert(RouteIntroduce routeIntroduce);

	public RouteIntroduce selectById(int id);

	public int update(RouteIntroduce routeIntroduce);

	public List<RouteIntroduce> getList();
	
	public List<Map<String, Object>> selectPage(Map<String, Object> args);
	
	public int selectPageCount(Map<String, Object> args);
	
	public Map<String, Object> selectByRouteId(int routeId);
	
}
