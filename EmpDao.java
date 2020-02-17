package com.vp.dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vp.model.Emp;

@Repository
@Transactional
public class EmpDao {

	@Autowired
	SessionFactory sessionFactory;
/*	
   List<Emp> list = null;
   public List<Emp> getAllEmp(){
	   list = new ArrayList<Emp>();
	   list.add(new Emp(11, "bindu", 33));
	   list.add(new Emp(12, "bhavana", 31));
	   list.add(new Emp(13, "sivam", 23));
	   list.add(new Emp(13, "amir", 23));
	   return list;*/
	public List<Emp> getAllEmp(){
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Emp.class);
		return criteria.list();
	}
	
	public void saveOrUpdate(Emp emp) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(emp);
	}
	
	
	
}