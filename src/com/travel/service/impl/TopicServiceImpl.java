package com.travel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.TopicDao;
import com.travel.model.Topic;
import com.travel.service.TopicService;

@Service("topicService")
public class TopicServiceImpl implements TopicService {
	@Autowired
	private TopicDao topicDao;

	public int insert(Topic topic) {

		return topicDao.insert(topic);
	}

	public List<Topic> getList() {

		return topicDao.getList();
	}

	public int delete(int id) {

		return topicDao.deleteById(id);
	}

	public Topic findById(int id) {

		return topicDao.selectById(id);
	}

	public int update(Topic topic) {

		return topicDao.update(topic);
	}

	public List<Topic> getListByPathId(int pathId) {

		return topicDao.getListByPathId(pathId);
	}

}
