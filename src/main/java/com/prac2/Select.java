package com.prac2;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Select {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
//		we don't need transaction in order to fetch the data from database
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

//		we create query from session to fetch the data 
//		we passed the query to list because list can catch all the data from database
		Query query = session.createQuery("from Student");
		List<Student>students = query.list();
//		we are using for each loop for iteration of the list
		for (Student student : students) {
			System.out.println("ID = "+student.getId());
			System.out.println("First name = "+student.getFirstName());
			System.out.println("Last name = "+student.getLastName());
		}

		session.close();
		sessionFactory.close();
		System.out.println("Record retrieved successfully.");

	}

}
