package com.travel.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.CommentDao;
import com.travel.model.Comment;
import com.travel.service.CommentService;

@Service("commentService")
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentDao commentDao;

	public int insert(Comment comment) {

		return commentDao.insert(comment);
	}

	public List<Comment> getList() {

		return commentDao.getList();
	}

	public int delete(int id) {

		return commentDao.deleteById(id);
	}

	public Comment findById(int id) {

		return commentDao.selectById(id);
	}

	public int update(Comment comment) {

		return commentDao.update(comment);
	}

	public List<Map<String, Object>> getListByRouteId(int routeId) {
		List<Map<String, Object>> mapList = commentDao
				.getListByRouteId(routeId);
		return mapList;
	}

	public Comment selectByRouteIdUserId(Map<String, Object> args) {
		Comment comment = commentDao.selectByRouteIdUserId(args);
		return comment;
	}

	public List<Map<String, Object>> selectPage(int curPage, int linePerPage,
			Map<String, Object> args) {
		int startLine = (curPage - 1) * linePerPage;
		int limitLine = linePerPage;

		args.put("startLine", startLine);
		args.put("limitLine", limitLine);
		List<Map<String, Object>> maps = commentDao.selectPage(args);

		return maps;
	}

	public int totlePage(int linePerPage, Map<String, Object> args) {
		int totalLine = commentDao.selectPageCount(args);
		int totalPage = (totalLine % linePerPage == 0) ? totalLine
				/ linePerPage : Math.abs(totalLine / linePerPage) + 1;

		return totalPage;
	}

}
