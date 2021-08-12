package org.agileguru.app.myfavcars.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CarModelTest {

	private static final String MADE_BY = "Honda";
	private Car mycar = new Car();

	@Test
	void test() {
		assertThat(mycar).isNotNull();
		mycar.setManufacturer(MADE_BY);
		assertThat(mycar.getManufacturer()).
		isNotNull().isNotEmpty().
		isEqualTo(MADE_BY);
	}

}
