package com.travel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.PoiDao;
import com.travel.model.Poi;
import com.travel.service.PoiService;

@Service("poiService")
public class PoiServiceImpl implements PoiService {
	@Autowired
	private PoiDao poiDao;

	public int insert(Poi poi) {

		return poiDao.insert(poi);
	}

	public List<Poi> getList() {

		return poiDao.getList();
	}

	public int delete(int id) {

		return poiDao.deleteById(id);
	}

	public Poi findById(int id) {

		return poiDao.selectById(id);
	}

	public int update(Poi poi) {

		return poiDao.update(poi);
	}

	public List<Poi> getListByRouteId(int routeId) {
		List<Poi> poiList = poiDao.getListByRouteId(routeId);
		return poiList;
	}

}
