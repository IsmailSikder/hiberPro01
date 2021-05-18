package com.ismail.hibernate.dto;

import java.io.Serializable;

public class EmpDto implements Serializable{

	/**
	 * serialVersionUID = 3185096524929038488L;
	 */
	private static final long serialVersionUID = 3185096524929038488L;
	
	private int id; 
	private String Name;
	private long salary;
	
	private String street;
	private String city;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return Name;
	}
	public void setEmpName(String empName) {
		this.Name = empName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString(){
		return this.street + " " + this.city + " " + this.Name + " "+this.salary;
	}
}
