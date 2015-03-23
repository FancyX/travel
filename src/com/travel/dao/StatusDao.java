package com.travel.dao;

import java.util.List;

import com.travel.model.Status;

public interface StatusDao {

	public int deleteById(int id);

	public int insert(Status status);

	public Status selectById(int id);

	public int update(Status status);

	public List<Status> getList();

}
