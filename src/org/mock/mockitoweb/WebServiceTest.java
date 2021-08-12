package org.mock.mockitoweb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;  
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.junit.Test;

public class WebServiceTest {

	@Test
	public void testGetEmployeeNameAsPerAge() {
		WebRepository repo = mock(WebRepository.class);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("John", 20,20000l));
		employees.add(new Employee("Juliet",38, 38000l));
		
		when(repo.getEmployees()).thenReturn(employees); 
		
		WebService service = new WebService(repo);
		
		List<Employee> testEmployees = service.getEmployeeNameAsPerAge(30l);
		
		assertEquals(1, testEmployees.size());
		
		//assertEquals(true, testEmployees.containsKey("Test1"));
	}

}
