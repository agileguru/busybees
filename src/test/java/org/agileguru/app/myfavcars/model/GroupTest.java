package org.agileguru.app.myfavcars.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class GroupTest {

	private Person person = new Person("Gurumoorthy", 48);
	private Person dad = new Person("Raghupathy", 79);
	private Person mom = new Person("Radha", 74);
	private Car car = new Car();
	private PersonGroup family = new PersonGroup();

	@Test
	void testCanAddPeopleToGroup() {
		family.addPerson(person);
		family.addPerson(dad);
		family.addPerson(mom);

		assertThat(family.getAllPeople()).isNotEmpty().hasSize(3);

	}

}
