package com.travel.test;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.mytools.util.JsonUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.travel.model.Comment;
import com.travel.service.CommentService;

public class CommentTest {

	@Test
	public void getListByRouteId() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml",
						"classpath:mybatis-config.xml" });
		CommentService commentService = (CommentService) context
				.getBean("commentService");
		List<Map<String, Object>> commentList = commentService
				.getListByRouteId(2);

		System.out.println(JsonUtil.getJson(commentList));
	}

	@Test
	public void save() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml",
						"classpath:mybatis-config.xml" });
		CommentService commentService = (CommentService) context
				.getBean("commentService");

		Comment comment = new Comment();
		comment.setRouteId(2).setUserId(6).setContent("呵呵呵呵呵")
				.setTime(new Timestamp(System.currentTimeMillis()));
		commentService.insert(comment);

		System.out.println(comment.getId());
	}
	
	@Test
	public void detail() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:applicationContext.xml",
						"classpath:mybatis-config.xml" });
		CommentService commentService = (CommentService) context
				.getBean("commentService");
		
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("routeId", 2);
		args.put("userId", 5);
		Comment comment = commentService.selectByRouteIdUserId(args);

		System.out.println(JsonUtil.getJson(comment));
	}
}
