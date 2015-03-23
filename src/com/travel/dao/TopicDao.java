package com.travel.dao;

import java.util.List;

import com.travel.model.Topic;

public interface TopicDao {

	public int deleteById(int id);

	public int insert(Topic topic);

	public Topic selectById(int id);

	public int update(Topic topic);

	public List<Topic> getList();

	public List<Topic> getListByPathId(int pathId);

}
