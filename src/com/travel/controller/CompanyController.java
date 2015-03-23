package com.travel.controller;

import javax.servlet.http.HttpServletRequest;

import org.mytools.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.travel.model.Company;
import com.travel.service.companyService;

@Controller
@RequestMapping("/companys")
public class CompanyController {

	@Autowired
	private companyService companyService;

	/*
	 * 获取公司详情
	 * 
	 * @param int companyId
	 */
	@RequestMapping(value = "/detail", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String detail(HttpServletRequest request) {

		int companyId = ServletRequestUtils.getIntParameter(request,
				"companyId", 1);
		Company company = companyService.findById(companyId);
		return JsonUtil.getJson(company);
	}
}
