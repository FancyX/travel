package com.travel.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.mytools.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travel.model.Answer;
import com.travel.service.AnswerService;

@Controller
@RequestMapping("/answer")
public class AnswerController {

	@Autowired
	private AnswerService answerService;

	/*
	 * 获取用戶答题分數
	 * 
	 * @param int pathId
	 * 
	 * @param int userId
	 */
	@RequestMapping(value = "/detail ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String detail(HttpServletRequest request, Model model) {

		int pathId = ServletRequestUtils.getIntParameter(request, "pathId", 0);
		int userId = ServletRequestUtils.getIntParameter(request, "userId", 0);

		Map<String, Object> args = new HashMap<String, Object>();
		args.put("pathId", pathId);
		args.put("userId", userId);
		Answer answer = answerService.selectByUserIdPathId(args);
		return JsonUtil.getJson(answer);
	}

	/*
	 * 保存用戶答题分數
	 * 
	 * @param int pathId
	 * 
	 * @param int userId
	 * 
	 * @param int score
	 */
	@RequestMapping(value = "/save ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String save(HttpServletRequest request, Model model) {

		int pathId = ServletRequestUtils.getIntParameter(request, "pathId", 0);
		int userId = ServletRequestUtils.getIntParameter(request, "userId", 0);
		int score = ServletRequestUtils.getIntParameter(request, "score", 0);
		Answer answer = new Answer();
		answer.setPathId(pathId).setUserId(userId).setScore(score);
		answerService.insert(answer);

		model.addAttribute("id", answer.getId());
		return JsonUtil.getJson(model);
	}

	/*
	 * 获取用戶答题排名
	 * 
	 * @param int pathId
	 * 
	 * @param int userId
	 */
	@RequestMapping(value = "/rank ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String rank(HttpServletRequest request, Model model) {

		int pathId = ServletRequestUtils.getIntParameter(request, "pathId", 0);
		int userId = ServletRequestUtils.getIntParameter(request, "userId", 0);

		Map<String, Object> args = new HashMap<String, Object>();
		args.put("userId", userId);
		args.put("pathId", pathId);
		int rank = answerService.getRank(args);
		model.addAttribute("rank", rank);
		return JsonUtil.getJson(model);
	}
}
