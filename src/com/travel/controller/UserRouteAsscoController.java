package com.travel.controller;

import javax.servlet.http.HttpServletRequest;

import org.mytools.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travel.model.UserRouteAssco;
import com.travel.service.UserRouteAsscoService;

@Controller
@RequestMapping("/userRouteAssco")
public class UserRouteAsscoController {

	@Autowired
	private UserRouteAsscoService userRouteAsscoService;

	/*
	 * 收藏线路
	 * 
	 * @param int routeId
	 * 
	 * @param int userId
	 */
	@RequestMapping(value = "/save ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String save(HttpServletRequest request, Model model) {

		int routeId = ServletRequestUtils
				.getIntParameter(request, "routeId", 0);
		int userId = ServletRequestUtils.getIntParameter(request, "userId", 0);
		UserRouteAssco userRouteAssco = new UserRouteAssco();
		userRouteAssco.setRouteId(routeId);
		userRouteAssco.setUserId(userId);

		userRouteAsscoService.insert(userRouteAssco);
		model.addAttribute("id", userRouteAssco.getId());
		return JsonUtil.getJson(model);
	}
}
