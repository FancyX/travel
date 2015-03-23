package com.travel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.dao.CompanyDao;
import com.travel.model.Company;
import com.travel.service.companyService;

@Service("companyService")
public class CompanyServiceImpl implements companyService {
	@Autowired
	private CompanyDao companyDao;

	public int insert(Company company) {

		return companyDao.insert(company);
	}

	public List<Company> getList() {

		return companyDao.getList();
	}

	public int delete(int id) {

		return companyDao.deleteById(id);
	}

	public Company findById(int id) {
		return companyDao.selectById(id);
	}

	public int update(Company company) {

		return companyDao.update(company);
	}

}
