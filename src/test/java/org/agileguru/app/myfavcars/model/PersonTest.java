package org.agileguru.app.myfavcars.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {
	
	private Person person = new Person("Gurumoorthy", 48);
	private Person dad = new Person("Raghupathy",79);
	private Person mom  = new Person("Radha",74);
	private Car car = new Car();
	
	@Test
	void test() {
		Assertions.assertThat(person).isNotNull();
		person.setDad(dad);
		person.setMom(mom);
		person.setCar(car);
		car.setManufacturer("Honda");
		
		assertThat(person.getDad().getName()).isNotNull().isEqualTo("Raghupathy");
		
	}
	
	@Test
	void testPersonAttributes() {
		Assertions.assertThat(person).isNotNull();
		dad.setAge(79);
		dad.setSurName("Ratnavelu");
		person.setDad(dad);
		person.setMom(mom);
		person.setCar(car);
		car.setManufacturer("Honda");
		
		assertThat(person.getDad().getName()).isNotNull().isEqualTo("Raghupathy");
		assertThat(person.getDad().getAge()).isNotNull().isEqualTo(79);
		assertThat(person.getDad().getSurName()).isNotNull().isEqualTo("Ratnavelu");
		
	}

}
