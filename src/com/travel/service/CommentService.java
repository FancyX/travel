package com.travel.service;

import java.util.List;
import java.util.Map;

import com.travel.model.Comment;

public interface CommentService {
	public int insert(Comment comment);

	public List<Comment> getList();

	public int delete(int id);

	public Comment findById(int id);

	public int update(Comment comment);
	
	public List<Map<String, Object>> getListByRouteId(int routeId);
	
	public Comment selectByRouteIdUserId(Map<String, Object> args);
	
	public List<Map<String, Object>> selectPage(int curPage, int linePerPage,
			Map<String, Object> args);

	public int totlePage(int linePerPage, Map<String, Object> args);

}
