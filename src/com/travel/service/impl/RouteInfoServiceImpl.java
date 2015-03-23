package com.travel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.RouteInfoDao;
import com.travel.model.RouteInfo;
import com.travel.service.RouteInfoService;

@Service("routeInfoService")
public class RouteInfoServiceImpl implements RouteInfoService {
	@Autowired
	private RouteInfoDao routeInfoDao;

	public int insert(RouteInfo routeInfo) {

		return routeInfoDao.insert(routeInfo);
	}

	public List<RouteInfo> getList() {

		return routeInfoDao.getList();
	}

	public int delete(int id) {

		return routeInfoDao.deleteById(id);
	}

	public RouteInfo findById(int id) {

		return routeInfoDao.selectById(id);
	}

	public int update(RouteInfo routeInfo) {

		return routeInfoDao.update(routeInfo);
	}

}
