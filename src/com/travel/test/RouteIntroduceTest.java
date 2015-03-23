package com.travel.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.mytools.util.JsonUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.travel.model.RouteIntroduce;
import com.travel.service.RouteIntroduceService;

public class RouteIntroduceTest {

	@Test
	public void save() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml",
						"classpath:mybatis-config.xml" });
		RouteIntroduceService routeIntroduceService = (RouteIntroduceService) context
				.getBean("routeIntroduceService");
		RouteIntroduce routeIntroduce = new RouteIntroduce();
		routeIntroduce.setRouteId(2);
		routeIntroduce.setImg("http://1.jpg");
		routeIntroduce.setWord("很神奇的一条线路！");
		System.out.println(routeIntroduceService.insert(routeIntroduce));
		System.out.println(routeIntroduce.getId());
	}

	@Test
	public void getRouteListPage() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml",
						"classpath:mybatis-config.xml" });
		RouteIntroduceService routeIntroduceService = (RouteIntroduceService) context
				.getBean("routeIntroduceService");
		
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("city", "11");
		List<Map<String, Object>> maps = routeIntroduceService.selectPage(1, 2,
				args);

		System.out.println(JsonUtil.getJson(maps));

	}

	@Test
	public void getTotlePage() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml",
						"classpath:mybatis-config.xml" });
		RouteIntroduceService routeIntroduceService = (RouteIntroduceService) context
				.getBean("routeIntroduceService");
		
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("city", "11");
		int totlePage = routeIntroduceService.totlePage(2, args);

		System.out.println(totlePage);
	}

	@Test
	public void selectByRouteId() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml",
						"classpath:mybatis-config.xml" });
		RouteIntroduceService routeIntroduceService = (RouteIntroduceService) context
				.getBean("routeIntroduceService");
		Map<String, Object> map = routeIntroduceService.selectByRouteId(2);

		System.out.println(JsonUtil.getJson(map));
	}

}
