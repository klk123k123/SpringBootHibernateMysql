package com.example.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EmployeeEntity;

import jakarta.persistence.EntityManager;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO{

	@Autowired
	private EntityManager entityManager; //inject session factory to get current session

	@Override
	public List<EmployeeEntity> get() {
		// TODO Auto-generated method stub
		Session currentsession=entityManager.unwrap(Session.class);
		Query<EmployeeEntity> query=currentsession.createQuery("from EmployeeEntity ",EmployeeEntity.class);
		List<EmployeeEntity>list=query.getResultList();
		return list;
	}

	@Override
	public EmployeeEntity get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(EmployeeEntity employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
