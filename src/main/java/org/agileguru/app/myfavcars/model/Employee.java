package org.agileguru.app.myfavcars.model;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String surName;
	private String email;
	private String city;

	public void setId(Integer id) {
		this.id = id;
		
	}

	public Integer getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		if ( null == city || city.isEmpty() || city.trim().isEmpty() ) {
			throw new RuntimeException("City Cannot be empty");
		}
		this.city = city;
	}

}
