package com.travel.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.mytools.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travel.model.Poi;
import com.travel.service.PoiService;

@Controller
@RequestMapping("/pois")
public class PoiController {

	@Autowired
	private PoiService poiService;

	/*
	 * 获取线路点集合
	 * 
	 * @param int routeId
	 */
	@RequestMapping(value = "/list ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String list(HttpServletRequest request) {

		int routeId = ServletRequestUtils
				.getIntParameter(request, "routeId", 0);
		List<Poi> poiList = poiService.getListByRouteId(routeId);
		return JsonUtil.getJson(poiList);
	}

	/*
	 * 获取线路点详情
	 * 
	 * @param int id
	 */
	@RequestMapping(value = "/detail ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String detail(HttpServletRequest request) {

		int id = ServletRequestUtils.getIntParameter(request, "id", 0);
		Poi poi = poiService.findById(id);
		return JsonUtil.getJson(poi);
	}

}
