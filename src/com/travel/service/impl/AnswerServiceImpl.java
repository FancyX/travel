package com.travel.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.AnswerDao;
import com.travel.model.Answer;
import com.travel.service.AnswerService;

@Service("answerService")
public class AnswerServiceImpl implements AnswerService {
	@Autowired
	private AnswerDao answerDao;

	public int insert(Answer answer) {

		return answerDao.insert(answer);
	}

	public List<Answer> getList() {

		return answerDao.getList();
	}

	public int delete(int id) {

		return answerDao.deleteById(id);
	}

	public Answer findById(int id) {

		return answerDao.selectById(id);
	}

	public int update(Answer answer) {

		return answerDao.update(answer);
	}

	public Answer selectByUserIdPathId(Map<String, Object> args) {

		return answerDao.selectByUserIdPathId(args);
	}

	public int getRank(Map<String, Object> args) {
		int rank = answerDao.getRank(args) + 1;
		return rank;
	}

}
