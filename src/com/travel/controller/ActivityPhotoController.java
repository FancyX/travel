package com.travel.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.mytools.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.travel.model.ActivityPhoto;
import com.travel.service.ActivityPhotoService;
import com.travel.utils.FileUtils;

@Controller
@RequestMapping("/activityPhoto")
public class ActivityPhotoController {

	@Autowired
	private ActivityPhotoService activityPhotoService;

	/*
	 * 获取活动图片
	 * 
	 * @param int routeId
	 * 
	 * @param int userId
	 */
	@RequestMapping(value = "/list ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String list(HttpServletRequest request) {

		int routeId = ServletRequestUtils
				.getIntParameter(request, "routeId", 0);
		int userId = ServletRequestUtils.getIntParameter(request, "userId", 0);

		Map<String, Object> args = new HashMap<String, Object>();
		args.put("routeId", routeId);
		args.put("userId", userId);

		List<ActivityPhoto> activityPhotos = activityPhotoService.getList(args);
		return JsonUtil.getJson(activityPhotos);
	}

	/*
	 * 上传活动图片 
	 * 
	 * @param int routeId
	 * 
	 * @param int userId
	 * 
	 * @param 上传文件
	 */
	@RequestMapping(value = "/upload ", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String upload(MultipartHttpServletRequest request, Model model) {
		int routeId = ServletRequestUtils
				.getIntParameter(request, "routeId", 2);
		int userId = ServletRequestUtils.getIntParameter(request, "userId", 2);
		/* 处理文件上传 */
		List<MultipartFile> files = FileUtils.getFiles(request);
		String systemPath = request.getSession().getServletContext()
				.getRealPath("/");

		List<String> urlList = new ArrayList<String>();
		try {
			urlList = FileUtils.uploadFile(files, "/photo", systemPath);
			model.addAttribute("status", true);
		} catch (Exception e) {
			model.addAttribute("status", false);
		}

		for (String url : urlList) {
			ActivityPhoto activityPhoto = new ActivityPhoto();
			activityPhoto.setUrl(url).setUserId(userId).setRouteId(routeId)
					.setTime(new Timestamp(System.currentTimeMillis()));
			model.addAttribute("url", url);
			activityPhotoService.insert(activityPhoto);
		}

		return JsonUtil.getJson(model);
	}
}
