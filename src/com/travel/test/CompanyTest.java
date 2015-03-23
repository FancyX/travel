package com.travel.test;

import org.junit.Test;
import org.mytools.util.JsonUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.travel.model.Company;
import com.travel.service.companyService;

public class CompanyTest {

	@Test
	public void detail() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml",
						"classpath:mybatis-config.xml" });
		companyService companyService = (companyService) context
				.getBean("companyService");
		Company company = companyService.findById(1);

		System.out.println(JsonUtil.getJson(company));
	}

}
