package com.travel.dao;

import java.util.List;

import com.travel.model.Company;

public interface CompanyDao {

	public int deleteById(int id);

	public int insert(Company company);

	public Company selectById(int id);

	public int update(Company company);

	public List<Company> getList();

}
