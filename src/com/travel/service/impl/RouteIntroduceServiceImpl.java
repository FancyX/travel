package com.travel.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.RouteIntroduceDao;
import com.travel.model.RouteIntroduce;
import com.travel.service.RouteIntroduceService;

@Service("routeIntroduceService")
public class RouteIntroduceServiceImpl implements RouteIntroduceService {
	@Autowired
	private RouteIntroduceDao routeIntroduceDao;

	public int insert(RouteIntroduce routeIntroduce) {

		return routeIntroduceDao.insert(routeIntroduce);
	}

	public List<RouteIntroduce> getList() {

		return routeIntroduceDao.getList();
	}

	public int delete(int id) {

		return routeIntroduceDao.deleteById(id);
	}

	public RouteIntroduce findById(int id) {

		return routeIntroduceDao.selectById(id);
	}

	public int update(RouteIntroduce routeIntroduce) {

		return routeIntroduceDao.update(routeIntroduce);
	}

	public int totlePage(int linePerPage, Map<String, Object> args) {

		int totalLine = routeIntroduceDao.selectPageCount(args);
		int totalPage = (totalLine % linePerPage == 0) ? totalLine
				/ linePerPage : Math.abs(totalLine / linePerPage) + 1;

		return totalPage;
	}

	public List<Map<String, Object>> selectPage(int curPage, int linePerPage,
			Map<String, Object> args) {
		int startLine = (curPage - 1) * linePerPage;
		int limitLine = linePerPage;

		args.put("startLine", startLine);
		args.put("limitLine", limitLine);
		List<Map<String, Object>> maps = routeIntroduceDao.selectPage(args);

		return maps;
	}

	public Map<String, Object> selectByRouteId(int routeId) {
		Map<String, Object> map = routeIntroduceDao.selectByRouteId(routeId);
		return map;
	}

}
