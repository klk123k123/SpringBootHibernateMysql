package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.EmployeeEntity;

public interface EmployeeService {
	List<EmployeeEntity> get();
	EmployeeEntity get(int id);
	void save(EmployeeEntity employee);
	void delete(int id);

}
