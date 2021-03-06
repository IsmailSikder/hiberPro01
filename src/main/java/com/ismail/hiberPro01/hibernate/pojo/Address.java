package com.ismail.hiberPro01.hibernate.pojo;
// Generated Jun 14, 2020 2:02:56 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Address generated by hbm2java
 */
@Entity
@Table(name = "address", catalog = "emp")
public class Address implements java.io.Serializable {

	private Integer addressId;
	private String street;
	private String city;
	private Set<Emps> empses = new HashSet<Emps>(0);

	public Address() {
	}

	public Address(String street, String city) {
		this.street = street;
		this.city = city;
	}

	public Address(String street, String city, Set<Emps> empses) {
		this.street = street;
		this.city = city;
		this.empses = empses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "address_id", unique = true, nullable = false)
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Column(name = "street", nullable = false, length = 200)
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "city", nullable = false, length = 45)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
	public Set<Emps> getEmpses() {
		return this.empses;
	}

	public void setEmpses(Set<Emps> empses) {
		this.empses = empses;
	}

}
