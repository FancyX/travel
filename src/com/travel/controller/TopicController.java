package com.travel.controller;

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

	/*
	 * 验证答案
	 * 
	 * @param int topicId ，String answer
	 */
	@RequestMapping(value = "/validate ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String validate(HttpServletRequest request, Model model) {
		int topicId = ServletRequestUtils
				.getIntParameter(request, "topicId", 0);
		String answer = ServletRequestUtils.getStringParameter(request,
				"answer", null);
		Topic topic = topicService.findById(topicId);
		Map<String, Object> args = new HashMap<String, Object>();
		if (answer.contains(topic.getAnswer())) {
			args.put("status", 1);
		} else {
			args.put("status", 0);
		}
		args.put("score", topic.getScore());
		
		return JsonUtil.getJson(args);
	}

}
