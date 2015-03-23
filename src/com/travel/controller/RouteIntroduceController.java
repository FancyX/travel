package com.travel.controller;

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

import com.travel.service.RouteIntroduceService;

@Controller
@RequestMapping("/route")
public class RouteIntroduceController {

	@Autowired
	private RouteIntroduceService routeIntroduceService;

	/*
	 * 获取线路页数
	 * 
	 * @param int linePerPage 每页个数
	 * 
	 * @param 查询条件 ( route_info所有字段)
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
		int totlePage = routeIntroduceService.totlePage(linePerPage, args);
		model.addAttribute("totlePage", totlePage);

		return JsonUtil.getJson(model);

	}

	/*
	 * 获取线路单页列表
	 * 
	 * @param int curPage 第几页
	 * 
	 * @param int linePerPage 每页个数
	 * 
	 * @param 查询条件 ( route_info所有字段)
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

		List<Map<String, Object>> maps = routeIntroduceService.selectPage(
				curPage, linePerPage, args);

		return JsonUtil.getJson(maps);

	}

	/*
	 * 获取线路详情
	 * 
	 * @param int routeId
	 */
	@RequestMapping(value = "/detail ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String detail(HttpServletRequest request) {

		int routeId = ServletRequestUtils
				.getIntParameter(request, "routeId", 0);
		Map<String, Object> map = routeIntroduceService
				.selectByRouteId(routeId);

		return JsonUtil.getJson(map);

	}

}
