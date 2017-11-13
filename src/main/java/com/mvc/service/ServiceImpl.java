package com.mvc.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.models.Bean;
import com.mvc.classes.PersistentClass;
import com.mvc.dao.MVCDAO;

public class ServiceImpl implements ServiceClass{

	private static final Log log = LogFactory.getLog(ServiceImpl.class);
	@Autowired
	@Qualifier(value = "systemAdminMgmtDao")
	private MVCDAO mvcDaoImpl;
	
	
	public List<Bean> getList() {
		List<PersistentClass> listArray = mvcDaoImpl.getList();
		List<Bean> beansList = new ArrayList<Bean>(); 
		//business logic for populating data into beans
		for(PersistentClass pc:listArray) {
			Bean b = new Bean();
			b.setId(pc.getId());
			b.setFirstName(pc.getFirstName());
			b.setLastName(pc.getLastName());
			b.setCity(pc.getCity());
			b.setPin(pc.getPin());
			beansList.add(b);
		}
		return beansList;
	}

	public PersistentClass getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateById(PersistentClass updateDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
