package com.ibm.fsd.my_first_maven_demo;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryStudentDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();


		Session session = factory.openSession();
		
		
		
		try {
			
			// start a transaction
						session.beginTransaction();
						
						// query students
						List<Student> theStudents = session.createQuery("from Student").getResultList();
						
						// display the students
						displayStudents(theStudents);
						
						// query students: lastName='Doe'
						Query query = session.createQuery("from Student s where s.lastName=:lName");
						query.setParameter("lName", "Doe");
						theStudents=query.getResultList();
				//		displayStudents(theStudents);
						// display the students
						System.out.println("\n\nStudents who have last name of Doe");
						displayStudents(theStudents);
						
						// query students: lastName='Doe' OR firstName='Daffy'
						
						theStudents =session.createQuery("from Student s where" + " s.lastName='Doe' OR s.firstName='Daffy'").getResultList();
						
						System.out.println("\n\nStudents who have last name of Doe OR first name Daffy");
						displayStudents(theStudents);
						
						// query students where email LIKE '%gmail.com'
						theStudents = session.createQuery("from Student s where"
								+ " s.email LIKE '%gmail.com'").getResultList();

						System.out.println("\n\nStudents whose email ends with gmail.com");			
						displayStudents(theStudents);
						
						// commit transaction
						session.getTransaction().commit();
						
						System.out.println("Done!");
			
		} finally {
			// TODO: handle finally clause
			factory.close();
			}
		}
		
		private static void displayStudents(List<Student> theStudents) {
			for (Student tempStudent : theStudents) {
				System.out.println(tempStudent);
			}

	}

}
