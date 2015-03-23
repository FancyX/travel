package com.travel.service;

import java.util.List;
import java.util.Map;

import com.travel.model.Answer;

public interface AnswerService {
	public int insert(Answer answer);

	public List<Answer> getList();

	public int delete(int id);

	public Answer findById(int id);

	public int update(Answer answer);

	public Answer selectByUserIdPathId(Map<String, Object> args);

	public int getRank(Map<String, Object> args);
}
