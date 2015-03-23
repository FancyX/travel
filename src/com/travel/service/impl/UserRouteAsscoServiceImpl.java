package com.travel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.UserRouteAsscoDao;
import com.travel.model.UserRouteAssco;
import com.travel.service.UserRouteAsscoService;

@Service("userRouteAsscoService")
public class UserRouteAsscoServiceImpl implements UserRouteAsscoService {
	@Autowired
	private UserRouteAsscoDao userRouteAsscoDao;

	public int insert(UserRouteAssco userRouteAssco) {

		return userRouteAsscoDao.insert(userRouteAssco);
	}

	public List<UserRouteAssco> getList() {

		return userRouteAsscoDao.getList();
	}

	public int delete(int id) {

		return userRouteAsscoDao.deleteById(id);
	}

	public UserRouteAssco findById(int id) {

		return userRouteAsscoDao.selectById(id);
	}

	public int update(UserRouteAssco userRouteAssco) {

		return userRouteAsscoDao.update(userRouteAssco);
	}

}
