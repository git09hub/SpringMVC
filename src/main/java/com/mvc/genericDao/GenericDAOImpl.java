package com.mvc.genericDao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Transactional
public class GenericDAOImpl<T> 
    implements GenericDAO<T> {

	@Autowired
    public SessionFactory sessionFactory;
	
    protected Class<T> entityClass;

    @PersistenceContext
    protected EntityManager entityManager;

    public Serializable create(T object) {
    	sessionFactory.getCurrentSession().clear();
        return sessionFactory.getCurrentSession().save(object);
    }

    public T read(T id) {
        return this.entityManager.find(entityClass, id);
    }

    public void update(T object) {
        sessionFactory.getCurrentSession().saveOrUpdate(object);
    }

    public void delete(T object) {
    	sessionFactory.getCurrentSession().clear();
        sessionFactory.getCurrentSession().delete(object);
    }
    
    
    public Serializable save(T object) {
    	sessionFactory.getCurrentSession().clear();
        return sessionFactory.getCurrentSession().save(object);
    }

    
    public void saveOrUpdate(T object) {
        sessionFactory.getCurrentSession().saveOrUpdate(object);
    }

	public T read(Class<T> clazz, Serializable id) {
		return null;
	}

}	
	
