package com.travel.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mytools.util.JsonUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.travel.model.Answer;
import com.travel.service.AnswerService;

public class AnswerTest {

	@Test
	public void rank() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml",
						"classpath:mybatis-config.xml" });
		AnswerService answerService = (AnswerService) context
				.getBean("answerService");
		
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("userId", 2);
		args.put("pathId", 1);
		int rank = answerService.getRank(args);

		System.out.println(rank);
	}

	@Test
	public void detail() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml",
						"classpath:mybatis-config.xml" });
		AnswerService answerService = (AnswerService) context
				.getBean("answerService");
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("userId", 2);
		args.put("pathId", 1);
		Answer answer = answerService.selectByUserIdPathId(args);

		System.out.println(JsonUtil.getJson(answer));
	}
}
