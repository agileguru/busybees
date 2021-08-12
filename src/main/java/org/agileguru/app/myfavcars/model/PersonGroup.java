package org.agileguru.app.myfavcars.model;

import java.util.ArrayList;
import java.util.List;

public class PersonGroup {

	private List<Person> peopleInGroup = new ArrayList<>();
	
	public boolean addPerson(Person person) {
		return this.peopleInGroup.add(person);
	}
	
	public List<Person> getAllPeople() {
		return new ArrayList<>(peopleInGroup);
	}
}
