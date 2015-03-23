package com.travel.dao;

import java.util.List;
import java.util.Map;

import com.travel.model.Answer;

public interface AnswerDao {

	public int deleteById(int id);

	public int insert(Answer answer);

	public Answer selectById(int id);

	public int update(Answer answer);

	public List<Answer> getList();

	public Answer selectByUserIdPathId(Map<String, Object> args);

	public int getRank(Map<String, Object> args);

}
