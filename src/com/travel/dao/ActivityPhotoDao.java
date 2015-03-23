package com.travel.dao;

import java.util.List;
import java.util.Map;

import com.travel.model.ActivityPhoto;

public interface ActivityPhotoDao {

	public int deleteById(int id);

	public int insert(ActivityPhoto activityPhoto);

	public ActivityPhoto selectById(int id);

	public int update(ActivityPhoto activityPhoto);

	public List<ActivityPhoto> getList();

	public List<ActivityPhoto> getListByRouteIdUserId(Map<String, Object> args);

}
