package org.agileguru.app.myfavcars.model;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	private static final String CITY = "London";
	private static final String EMAIL = "webtechguru@gmail.com";
	private static final String SURNAME = "Raghupathy";
	private static final String NAME = "Guru";
	private static final Integer EMP_ID = 20075441;
	private static Employee emp = new Employee();
	
	@Test
	void test() {
		assertThat(emp).isNotNull();
		
	}

	@Test
	void testCanSetupAttributes() {
		emp.setId(EMP_ID);
		emp.setName(NAME);
		emp.setSurName(SURNAME);
		emp.setEmail(EMAIL);
		emp.setCity(CITY);
		
	}
	
	@Test
	void testEmailEmpty() {
		try { 
			emp.setCity("");
			fail("This line should never be executed");
		} catch ( RuntimeException exception) {
			// Good Code 
		}
		
		try { 
			emp.setCity(null);
			fail("This line should never be executed");
		} catch ( RuntimeException exception) {
			// Good Code 
		}
		
		try { 
			emp.setCity("   ");
			fail("This line should never be executed");
		} catch ( RuntimeException exception) {
			// Good Code 
		}
		
	}
	
	@Test
	void testCanReadAttributes() {
		assertThat(emp.getId()).isNotNull().isNotNegative().isEqualTo(EMP_ID);
		assertThat(emp.getCity()).isNotNull().isNotEmpty().isNotBlank().isEqualTo(CITY);
		assertThat(emp.getName()).isNotNull().isNotEmpty().isNotBlank().isEqualTo(NAME);
		assertThat(emp.getSurName()).isNotNull().isNotEmpty().isNotBlank().isEqualTo(SURNAME);
		assertThat(emp.getEmail()).isNotNull().isNotEmpty().isNotBlank().isEqualTo(EMAIL);
	}
}
