package com.ibm.fsd.my_first_maven_demo;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeTester {

	public static void main(String[] args) {
		
		try {
			
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = factory.openSession();
		
		Employee employee = new Employee("Sourav", "Ganguly", "Sourav@luv2code.com");
		session.getTransaction().begin();
		// Integer a = (Integer) session.save(employee);    it returns an integer
		session.persist(employee);
		System.out.println("Inserted>>>!");
		session.getTransaction().commit();
		
		Query query=session.createQuery("from Employee");
		@SuppressWarnings("unchecked")
		List<Employee> list=query.getResultList();
		
		for(Employee e:list)
		{
			System.out.println(e);
		}
		} 
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
