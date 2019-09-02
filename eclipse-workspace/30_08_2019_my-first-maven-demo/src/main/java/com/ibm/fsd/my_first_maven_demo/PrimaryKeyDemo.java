package com.ibm.fsd.my_first_maven_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.openSession();
		
		try {
			
			System.out.println("Creating 3 session objects...");
			Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
			Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
			Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");
			session.beginTransaction();
			
			System.out.println("saving the students...");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
			
		} finally {
			// TODO: handle finally clause
			factory.close();
		}

	}

}
