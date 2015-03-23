package com.travel.service;

import java.util.List;

import com.travel.model.Topic;

public interface TopicService {
	public int insert(Topic topic);

	public List<Topic> getList();

	public int delete(int id);

	public Topic findById(int id);

	public int update(Topic topic);

	public List<Topic> getListByPathId(int pathId);
}
