package com.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.Model.User;

public class UserDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public void insertOrUpdateUser(User u) {
		this.hibernateTemplate.saveOrUpdate(u);
	}
	
	@Transactional
	public void deleteUser(User u) {
		this.hibernateTemplate.delete(u);
	}
	
	public User getUserByID(int ID) {
		return this.hibernateTemplate.get(User.class, ID);
	}
	
	public List<User> getAllUser(){
		return this.hibernateTemplate.loadAll(User.class);
	}

}
