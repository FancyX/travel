package com.travel.dao;

import java.util.List;
import java.util.Map;

import com.travel.model.Comment;

public interface CommentDao {

	public int deleteById(int id);

	public int insert(Comment comment);

	public Comment selectById(int id);

	public int update(Comment comment);

	public List<Comment> getList();

	public List<Map<String, Object>> getListByRouteId(int routeId);

	public Comment selectByRouteIdUserId(Map<String, Object> args);

	public List<Map<String, Object>> selectPage(Map<String, Object> args);

	public int selectPageCount(Map<String, Object> args);
}
