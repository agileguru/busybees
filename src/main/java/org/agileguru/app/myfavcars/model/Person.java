package org.agileguru.app.myfavcars.model;

public class Person {
	private Person dad;
	private Person mom;
	private String name;
	private String surName;
	private Integer age;
	private Car car;

	public Person (String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Person getDad() {
		return dad;
	}

	public void setDad(Person dad) {
		this.dad = dad;
	}

	public Person getMom() {
		return mom;
	}

	public void setMom(Person mom) {
		this.mom = mom;
	}
}
