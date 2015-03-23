package com.travel.dao;

import java.util.List;

import com.travel.model.Certificate;

public interface CertificateDao {

	public int deleteById(int id);

	public int insert(Certificate certificate);

	public Certificate selectById(int id);

	public int update(Certificate certificate);

	public List<Certificate> getList();

}
