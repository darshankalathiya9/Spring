package com.SpringORM.Dao;

import java.util.List;

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

	/* Update Student */
	@Transactional
	public void updateStudent(Student s) {
		this.hibernateTemplate.update(s);
	}

	/* Delete Student */
	@Transactional
	public void deleteStudent(Student s) {
		this.hibernateTemplate.delete(s);
	}

	/* Single Data Fetch */
	public Student getStudentByID(int ID) {
		return this.hibernateTemplate.get(Student.class, ID);
	}

	/* Multiple Data Fetch */
	public List<Student> getAllStudent() {
		return this.hibernateTemplate.loadAll(Student.class);
	}
}
