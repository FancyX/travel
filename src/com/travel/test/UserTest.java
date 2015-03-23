package com.travel.test;

import org.junit.Test;
import org.mytools.util.JsonUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.travel.model.User;
import com.travel.service.UserService;

public class UserTest {

	@Test
	public void save() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml",
						"classpath:mybatis-config.xml" });
		UserService userService = (UserService) context.getBean("userService");
		User user = userService.findById(5);
		System.out.println(JsonUtil.getJson(user));
	}

}
