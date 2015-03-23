package com.travel.test;

import org.junit.Test;
import org.mytools.util.JsonUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.travel.model.Path;
import com.travel.service.PathService;

public class PathTest {

	@Test
	public void detail() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml",
						"classpath:mybatis-config.xml" });
		PathService pathService = (PathService) context.getBean("pathService");
		Path path = pathService.selectByRouteId(2);
		
		System.out.println(JsonUtil.getJson(path));
	}

}
