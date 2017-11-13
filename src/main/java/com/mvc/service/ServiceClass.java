package com.mvc.service;

import java.util.List;

import com.models.Bean;
import com.mvc.classes.PersistentClass;

public interface ServiceClass {
	
	public List<Bean> getList();  
	public PersistentClass getById(int id);
	public boolean updateById(PersistentClass updateDetails);
	public boolean deleteById(int id);
	
	
}
