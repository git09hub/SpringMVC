package com.mvc.genericDao;

import java.io.Serializable;

public interface GenericDAO<T>{
	
	Serializable create(T object);
	
	T read(Class<T> clazz, Serializable id);
	
	void update(T object);
	
	void delete(T id);

}

