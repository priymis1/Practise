package com.ibm.fsd.my_first_maven_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session=factory.openSession();
		
		try {
			
			System.out.println("Creating new student object...");
			Student tempStudent = new Student("Paul","Doe", "paul@luv2code.com");
			
			session.beginTransaction();
			
			System.out.println("Saving the student...");
			
			session.save(tempStudent);
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		} finally {
			// TODO: handle finally clause
			
			factory.close();
		}

	}

}
