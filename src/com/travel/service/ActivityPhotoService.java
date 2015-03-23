package com.travel.service;

import java.util.List;
import java.util.Map;

import com.travel.model.ActivityPhoto;

public interface ActivityPhotoService {
	public int insert(ActivityPhoto activityPhoto);

	public List<ActivityPhoto> getList();

	public int delete(int id);

	public ActivityPhoto findById(int id);

	public int update(ActivityPhoto activityPhoto);

	public List<ActivityPhoto> getList(Map<String, Object> args);
}
