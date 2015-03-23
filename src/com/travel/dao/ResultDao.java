package com.travel.dao;

import java.util.List;

import com.travel.model.Result;

public interface ResultDao {

	public int deleteById(int id);

	public int insert(Result result);

	public Result selectById(int id);

	public int update(Result result);

	public List<Result> getList();

	public Result selectByTopicId(int topicId);

}
