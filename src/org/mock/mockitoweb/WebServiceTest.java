package org.mock.mockitoweb;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;  
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;


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
		
		List<Employee> testEmployees = service.getEmployeeNameAsPerAge(30);
		
		assertEquals(1, testEmployees.size());
	
		Employee emp = testEmployees.get(0);
		
		assertEquals("John", emp.getName());
		assertEquals(20, emp.getAge());
	}
	
	@Test
	public void testGetEmployeeNameAsPerSalary() {
		WebRepository repo = mock(WebRepository.class);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("John", 20,50000l));
		employees.add(new Employee("Juliet",38, 28000l));
		
		when(repo.getEmployees()).thenReturn(employees); 
		
		WebService service = new WebService(repo);
		
		List<Employee> testEmployees = service.getEmployeeNameAsPerSalary(30000l);
		
		assertEquals(1, testEmployees.size());
	
		Employee emp = testEmployees.get(0);
		
		assertEquals("Juliet", emp.getName());
		assertEquals(38, emp.getAge());
		assertEquals(28000l, (long)emp.getSalary());
	}

}
