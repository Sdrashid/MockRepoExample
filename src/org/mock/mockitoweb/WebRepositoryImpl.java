package org.mock.mockitoweb;

import java.util.ArrayList;
import java.util.List;

public class WebRepositoryImpl implements WebRepository{

	@Override
	public List<Employee> getEmployees(){
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee("John", 20,20000l));
		employees.add(new Employee("Michael",25, 25000l));
		employees.add(new Employee("Mike",28, 28000l));
		employees.add(new Employee("Ajay",30, 30000l));
		employees.add(new Employee("Amy", 35, 35000l));
		employees.add(new Employee("Juliet",38, 38000l));
		employees.add(new Employee("Romeo", 40, 40000l));
		employees.add(new Employee("Robert", 45, 45000l));
		employees.add(new Employee("Simon", 58, 58000l));
		employees.add(new Employee("Raj", 50, 50000l));
		employees.add(new Employee("Prem", 15, 15000l));
		employees.add(new Employee("Amar", 18, 18000l));
		
		return employees;
		
	}
}
