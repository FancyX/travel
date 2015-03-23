package com.travel.service;

import java.util.List;

import com.travel.model.Result;

public interface ResultService {
	public int insert(Result result);

	public List<Result> getList();

	public int delete(int id);

	public Result findById(int id);

	public int update(Result result);

	public Result selectByTopicId(int topicId);
}
