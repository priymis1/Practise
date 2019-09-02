package com.ibm.fsd.my_first_maven_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdatestudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.openSession();
		
		try {
			
			int studentId = 10;
			
			// now get a new session and start transaction
			session = factory.openSession();
			session.beginTransaction();
			
			// retrieve student based on the id: primary key
			System.out.println("\nGetting student with id: " + studentId);
			
			Student myStudent = session.get(Student.class, studentId);
			
			System.out.println("Updating student...");
			myStudent.setFirstName("Scooby");
			myStudent.setLastName("Doe");
			myStudent.setEmail("scooby@luv2code.com");
			session.merge(myStudent);
			
			// commit the transaction
			session.getTransaction().commit();

						
			System.out.println("Done!");
			
			
			
		} finally {
			// TODO: handle finally clause
			factory.close();
		}

	}

}
