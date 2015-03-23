package com.travel.controller;

import javax.servlet.http.HttpServletRequest;

import org.mytools.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travel.model.Path;
import com.travel.service.PathService;

@Controller
@RequestMapping("/path")
public class PathController {

	@Autowired
	private PathService pathService;

	/*
	 * 获取路线详情
	 * 
	 * @param int routeId
	 */
	@RequestMapping(value = "/detail ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String detail(HttpServletRequest request, Model model) {

		int routeId = ServletRequestUtils
				.getIntParameter(request, "routeId", 0);
		Path path = pathService.selectByRouteId(routeId);
		return JsonUtil.getJson(path);
	}

}
