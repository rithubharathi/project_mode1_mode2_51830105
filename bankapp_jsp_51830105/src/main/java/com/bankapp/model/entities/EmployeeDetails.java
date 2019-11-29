package com.bankapp.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeedetails")
public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Column(unique=true)
	private Integer employeeId;
	private String designation;
	private Integer age;
	@Column(unique=true)
	private String email;
	private String phoneNumber;
	private String address;
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeDetails(String name, Integer employeeId, String designation, Integer age, String email,
			String phoneNumber, String address) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.designation = designation;
		this.age = age;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", employeeId=" + employeeId + ", designation="
				+ designation + ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
	

}
