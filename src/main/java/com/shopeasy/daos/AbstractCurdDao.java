package com.shopeasy.daos;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractCurdDao {

	@Autowired
	private SessionFactory sessFactory;
	
	public Session getSession() {
		return sessFactory.getCurrentSession();
	}
	
	public Serializable save(Object obj) {
		return getSession().save(obj);
	}
	
	public void update(Object obj) {
		getSession().update(obj);
	}
	
	public void saveOrUpdate(Object obj) {
		getSession().saveOrUpdate(obj);
	}
	
	public void delete(Object obj) {
		getSession().delete(obj);
	}
	
}
