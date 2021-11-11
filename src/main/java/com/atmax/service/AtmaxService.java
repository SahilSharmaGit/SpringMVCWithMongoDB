package com.atmax.service;

import java.util.List;

import com.atmax.model.AtmaxEmployee;

public interface AtmaxService {
	int insert(AtmaxEmployee emp);
	int update(AtmaxEmployee emp);
	int delete(String email);
	List<AtmaxEmployee> select(String email);
	List<AtmaxEmployee> selectAll();
	
}
