package com.travel.dao;

import java.util.List;

import com.travel.model.Pay;

public interface PayDao {

	public int deleteById(int id);

	public int insert(Pay pay);

	public Pay selectById(int id);

	public int update(Pay pay);

	public List<Pay> getList();

}
