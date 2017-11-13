package com.mvc.dao;

import java.util.List;

import com.mvc.classes.PersistentClass;
import com.mvc.genericDao.GenericDAO;

public interface MVCDAO extends GenericDAO<Object> {	
	public List<PersistentClass> getList();  
	public Object getById(int id);
	public boolean updateById(Object updateDetails);
	public boolean deleteById(int id);
	
}
