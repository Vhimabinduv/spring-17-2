package com.vp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vp.dao.EmpDao;
import com.vp.model.Emp;

@Service
public class EmpService {
   
	@Autowired
	EmpDao EmpDao;
	
	public List<Emp> getAllEmp(){
		return EmpDao.getAllEmp();
	}
public void saveOrUpdate(Emp emp) {
		
		EmpDao.saveOrUpdate(emp);
	}
	}