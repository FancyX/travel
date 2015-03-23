package com.travel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.PathDao;
import com.travel.model.Path;
import com.travel.service.PathService;

@Service("pathService")
public class PathServiceImpl implements PathService {
	@Autowired
	private PathDao pathDao;

	public int insert(Path path) {

		return pathDao.insert(path);
	}

	public List<Path> getList() {

		return pathDao.getList();
	}

	public int delete(int id) {

		return pathDao.deleteById(id);
	}

	public Path findById(int id) {

		return pathDao.selectById(id);
	}

	public int update(Path path) {

		return pathDao.update(path);
	}

	public Path selectByRouteId(int routeId) {
		Path path = pathDao.selectByRouteId(routeId);
		return path;
	}

}
