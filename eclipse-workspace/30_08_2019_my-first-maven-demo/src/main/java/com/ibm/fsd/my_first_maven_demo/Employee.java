package com.ibm.fsd.my_first_maven_demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;



@Entity
@Table(name = "employees")
@Data
public class Employee {
	
	@Id
	@Column(name ="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name= "firstName")
	private String firstName;
	@Column(name= "lastName")
	private String lastname;
	@Column(name= "email")
	private String email;
	
	public Employee() {
		super();
	}

	public Employee(String firstName, String lastname, String email) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + ", email=" + email + "]";
	}
	
	
	
	
	
	
	
	
	

}
