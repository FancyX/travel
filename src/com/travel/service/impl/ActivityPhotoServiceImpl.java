package com.travel.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.ActivityPhotoDao;
import com.travel.model.ActivityPhoto;
import com.travel.service.ActivityPhotoService;

@Service("activityPhotoService")
public class ActivityPhotoServiceImpl implements ActivityPhotoService {
	@Autowired
	private ActivityPhotoDao activityPhotoDao;

	public int insert(ActivityPhoto activityPhoto) {

		return activityPhotoDao.insert(activityPhoto);
	}

	public List<ActivityPhoto> getList() {

		return activityPhotoDao.getList();
	}

	public int delete(int id) {

		return activityPhotoDao.deleteById(id);
	}

	public ActivityPhoto findById(int id) {

		return activityPhotoDao.selectById(id);
	}

	public int update(ActivityPhoto activityPhoto) {

		return activityPhotoDao.update(activityPhoto);
	}

	public List<ActivityPhoto> getList(Map<String, Object> args) {
		List<ActivityPhoto> activityPhotos = activityPhotoDao
				.getListByRouteIdUserId(args);
		return activityPhotos;
	}

}
