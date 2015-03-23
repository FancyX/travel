package com.travel.test;

import java.util.List;

import org.junit.Test;
import org.mytools.util.JsonUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.travel.model.Poi;
import com.travel.service.PoiService;

public class PoiTest {

	@Test
	public void list() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml",
						"classpath:mybatis-config.xml" });
		PoiService poiService = (PoiService) context.getBean("poiService");
		List<Poi> poiList = poiService.getListByRouteId(2);
		
		System.out.println(JsonUtil.getJson(poiList));
	}

}
