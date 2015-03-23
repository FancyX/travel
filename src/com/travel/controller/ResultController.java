package com.travel.controller;

import javax.servlet.http.HttpServletRequest;

import org.mytools.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travel.model.Result;
import com.travel.service.ResultService;

@Controller
@RequestMapping("/result")
public class ResultController {

	@Autowired
	private ResultService resultService;

	/*
	 * 获取题目列表
	 * 
	 * @param int topicId
	 */
	@RequestMapping(value = "/detail ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String detail(HttpServletRequest request, Model model) {

		int topicId = ServletRequestUtils
				.getIntParameter(request, "topicId", 0);
		Result result = resultService.selectByTopicId(topicId);
		return JsonUtil.getJson(result);
	}

}
