package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	private EntityManager em;
	private Session session;
	@Autowired
	public StudentDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}
//@PostConstruct
public void init()
{
	
}

	@Override
	public Student createNewStudent(Student theStudent) {
		// TODO Auto-generated method stub
		session=em.unwrap(Session.class);
		return null;
	}
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		session = em.unwrap(Session.class);
		List<Student> lc = new ArrayList<Student>();
		Query rc = session.createQuery("from Student", Student.class);
		lc = rc.getResultList();
		return lc;
	}
	

}
