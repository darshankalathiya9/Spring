package com.SpringORM.Dao;

import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.SpringORM.Entity.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	/* Insert Student */
	@Transactional
	public void insertStudent(Student s) {
		this.hibernateTemplate.save(s);
	}
}
