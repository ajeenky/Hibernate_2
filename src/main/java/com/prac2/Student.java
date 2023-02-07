package com.prac2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//We are going to use annotations
//@Entity annotation marks the class as entity for database objects
@Entity
//@Table annotation defines table for database and we can choose the name for table
@Table (name = "stu1")
public class Student {

//  design type of hibernate which requires following things
//	maven java project + pojo class + hibernate.cfg.xml file + pom.xml + main class
//	when we add dependancy inside pom.xml it will configure automatically
//	it needs internet connection when creating an maven project
//	private global variables wich will be initialized when creating an object-->
	
//	@Id annotation makes the variable primary key of the table and we can choose if we want to modify the column name
	@Id
	@Column(name = "id")
//	@Generated value annotation allows us to choose the sequence of primary key 
//	we have to specify the strategy for generation type, if we keep it auto then it will decide on its own which strategy is best.
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "f_name")
	private String firstName;
	@Column(name = "l_name")
	private String lastName;
	
//	getters and setters to set and modify the values of class variables-->
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
