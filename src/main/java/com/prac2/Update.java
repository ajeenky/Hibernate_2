package com.prac2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

//		we can load/get the object from student table using student id which is an primary key of that table
		Student student = (Student) session.get(Student.class, 3);
		student.setFirstName("exception");
		
//		we use update method to modify value specified in get method from that respective table
		session.update(student);
		transaction.commit();
		session.close();
	}

}
