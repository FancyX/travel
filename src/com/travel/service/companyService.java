package com.travel.service;

import java.util.List;

import com.travel.model.Company;

public interface companyService {
	public int insert(Company company);

	public List<Company> getList();

	public int delete(int id);

	public Company findById(int id);

	public int update(Company company);

}
