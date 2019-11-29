package com.custapp.model.persistance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="customers")
public class Customer {
	@Id
	@GeneratedValue
	int id;
	private int custId;
	@NotEmpty
	private String name;
	@NotEmpty
	private String address;
	@NotEmpty
	private String phoneNumber;
	@NotEmpty
	@Email
	private String email;
	private Integer age;
	public Customer() {
	}
	public Customer(String name,int custId, String address, String phoneNumber, String email, Integer age) {
		super();
		this.name = name;
		this.custId=custId;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "customer [id=" + id + ", name=" + name +", custId=" + custId+ ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", age=" + age + "]";
	}
	
}
