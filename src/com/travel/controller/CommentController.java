package com.travel.controller;

import java.sql.Timestamp;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.mytools.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travel.model.Comment;
import com.travel.service.CommentService;

@Controller
@RequestMapping("/comment")
public class CommentController {

	@Autowired
	private CommentService commentService;

	/*
	 * 获取评论页数
	 * 
	 * @param int linePerPage 每页个数
	 * 
	 * @param 查询条件 ( comment所有字段)
	 */
	@RequestMapping(value = "/page ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String page(HttpServletRequest request, Model model) {
		Map<String, Object> args = new HashMap<String, Object>();

		int linePerPage = ServletRequestUtils.getIntParameter(request,
				"linePerPage", 0);

		@SuppressWarnings("unchecked")
		Enumeration<String> enumration = request.getParameterNames();
		while (enumration.hasMoreElements()) {
			String name = enumration.nextElement();
			args.put(name, request.getParameter(name));
		}
		int totlePage = commentService.totlePage(linePerPage, args);
		model.addAttribute("totlePage", totlePage);

		return JsonUtil.getJson(model);

	}

	/*
	 * 获取评论单页列表
	 * 
	 * @param int curPage 第几页
	 * 
	 * @param int linePerPage 每页个数
	 * 
	 * @param 查询条件 ( comment所有字段)
	 */
	@RequestMapping(value = "/pageList ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String pageList(HttpServletRequest request) {
		Map<String, Object> args = new HashMap<String, Object>();

		int curPage = ServletRequestUtils
				.getIntParameter(request, "curPage", 1);
		int linePerPage = ServletRequestUtils.getIntParameter(request,
				"linePerPage", 0);

		@SuppressWarnings("unchecked")
		Enumeration<String> enumration = request.getParameterNames();
		while (enumration.hasMoreElements()) {
			String name = enumration.nextElement();
			args.put(name, request.getParameter(name));
		}

		List<Map<String, Object>> maps = commentService.selectPage(curPage,
				linePerPage, args);

		return JsonUtil.getJson(maps);

	}

	/*
	 * 获取所有评论
	 * 
	 * @param int routeId
	 */
	@RequestMapping(value = "/list ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String list(HttpServletRequest request) {

		int routeId = ServletRequestUtils
				.getIntParameter(request, "routeId", 0);
		List<Map<String, Object>> mapList = commentService
				.getListByRouteId(routeId);
		return JsonUtil.getJson(mapList);
	}

	/*
	 * 获取评论详情
	 * 
	 * @param int routeId
	 * 
	 * @param int userId
	 */
	@RequestMapping(value = "/detail ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String detail(HttpServletRequest request) {

		int routeId = ServletRequestUtils
				.getIntParameter(request, "routeId", 0);
		int userId = ServletRequestUtils.getIntParameter(request, "userId", 0);

		Map<String, Object> args = new HashMap<String, Object>();
		args.put("routeId", routeId);
		args.put("userId", userId);
		Comment comment = commentService.selectByRouteIdUserId(args);
		return JsonUtil.getJson(comment);
	}

	// 保存评论
	/*
	 * 获取评论详情
	 * 
	 * @param int routeId
	 * 
	 * @param int userId
	 * 
	 * @param String content
	 */
	@RequestMapping(value = "/save ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String save(HttpServletRequest request, Model model) {
		Comment comment = new Comment();
		int routeId = ServletRequestUtils
				.getIntParameter(request, "routeId", 0);
		int userId = ServletRequestUtils.getIntParameter(request, "userId", 0);
		String content = ServletRequestUtils.getStringParameter(request,
				"content", null);

		comment.setRouteId(routeId);
		comment.setUserId(userId);
		comment.setContent(content);
		comment.setTime(new Timestamp(System.currentTimeMillis()));

		commentService.insert(comment);
		model.addAttribute("id", comment.getId());

		return JsonUtil.getJson(model);
	}

}
