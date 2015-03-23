package com.travel.controller;

import javax.servlet.http.HttpServletRequest;

import org.mytools.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travel.model.User;
import com.travel.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	/*
	 * 保存用户
	 * 
	 * @param int age
	 * 
	 * @param int sex
	 * 
	 * @param String wechatNum
	 * 
	 * @param String phone
	 * 
	 * @param String photo
	 */
	@RequestMapping(value = "/save ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String save(HttpServletRequest request, Model model) {

		String wechatNum = ServletRequestUtils.getStringParameter(request,
				"wechat_num", null);
		String phone = ServletRequestUtils.getStringParameter(request, "phone",
				null);
		int age = ServletRequestUtils.getIntParameter(request, "age", 0);
		int sex = ServletRequestUtils.getIntParameter(request, "sex", 0);
		String photo = ServletRequestUtils.getStringParameter(request, "photo",
				null);
		User user = new User();
		user.setAge(age).setPhone(phone).setPhoto(photo).setSex(sex)
				.setWechatNum(wechatNum);
		userService.insert(user);
		model.addAttribute("id", user.getId());

		return JsonUtil.getJson(model);
	}
}
