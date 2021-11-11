package com.atmax.dao;

import java.util.List;

import com.atmax.model.AtmaxEmployee;

public interface DMLDao {

	int insert(AtmaxEmployee emp);
	int update(AtmaxEmployee emp);
	int delete(String email);
	List<AtmaxEmployee> select(String email);
	List<AtmaxEmployee> selectAll();
}
