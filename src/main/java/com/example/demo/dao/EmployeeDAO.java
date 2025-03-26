package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.EmployeeEntity;

public interface EmployeeDAO{

	List<EmployeeEntity> get();
	EmployeeEntity get(int id);
	void save(EmployeeEntity employee);
	void delete(int id);
}
