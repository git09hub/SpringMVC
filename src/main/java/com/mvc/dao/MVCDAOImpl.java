package com.mvc.dao;


import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.mvc.classes.PersistentClass;
import com.mvc.genericDao.GenericDAOImpl;


@SuppressWarnings("deprecation")
public class MVCDAOImpl extends GenericDAOImpl<Object> implements MVCDAO{

	private static final Log log = LogFactory
			.getLog(MVCDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	
	/*@SuppressWarnings("unchecked")
	public List<Object[]> getList() {
		String query = "select * from PERSISTENTTABLE";
		SQLQuery sqlQuery = sessionFactory.getCurrentSession().createSQLQuery(query);
		List<Object[]> orgList = (List<Object[]>) sqlQuery.list();
		System.out.println("---40:MVCDAOImpl---"+orgList);
		return orgList;
	}*/

	@Override
	public Serializable create(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object read(Class<Object> clazz, Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Object object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		
	}

		
	@SuppressWarnings("unchecked")
	public List<PersistentClass> getList() {
		String query = "select * from PERSISTENTTABLE";
		SQLQuery sqlQuery = sessionFactory.getCurrentSession().createSQLQuery(query);
		List<PersistentClass> orgList = (List<PersistentClass>)sqlQuery.list();
		System.out.println("---40:MVCDAOImpl---"+orgList);
		return orgList;
	}

	public PersistentClass getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateById(Object updateDetails) {
		// TODO Auto-generated method stub
		return false;
	}
		
}
