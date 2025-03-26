package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.model.EmployeeEntity;
import com.example.demo.repository.EmployeeService;

import jakarta.persistence.EntityManager;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Transactional // It ensures that all operations within a transaction block are executed successfully, or rolled back entirely if an exception occurs.
	@Override
	public List<EmployeeEntity> get() {
		// TODO Auto-generated method stub
		return employeeDAO.get();
		
	}
	@Transactional
	@Override
	public EmployeeEntity get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public void save(EmployeeEntity employee) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
