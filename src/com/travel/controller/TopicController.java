package com.travel.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.mytools.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travel.model.Topic;
import com.travel.service.TopicService;

@Controller
@RequestMapping("/topic")
public class TopicController {

	@Autowired
	private TopicService topicService;

	/*
	 * 获取题目列表
	 * 
	 * @param int pathId
	 */
	@RequestMapping(value = "/list ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String list(HttpServletRequest request, Model model) {

		int pathId = ServletRequestUtils.getIntParameter(request, "pathId", 0);
		List<Topic> list = topicService.getListByPathId(pathId);
		return JsonUtil.getJson(list);
	}

}
