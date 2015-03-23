package com.travel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.ResultDao;
import com.travel.model.Result;
import com.travel.service.ResultService;

@Service("resultService")
public class ResultServiceImpl implements ResultService {
	@Autowired
	private ResultDao resultDao;

	public int insert(Result result) {

		return resultDao.insert(result);
	}

	public List<Result> getList() {

		return resultDao.getList();
	}

	public int delete(int id) {

		return resultDao.deleteById(id);
	}

	public Result findById(int id) {

		return resultDao.selectById(id);
	}

	public int update(Result result) {

		return resultDao.update(result);
	}

	public Result selectByTopicId(int topicId) {

		return resultDao.selectByTopicId(topicId);
	}

}
