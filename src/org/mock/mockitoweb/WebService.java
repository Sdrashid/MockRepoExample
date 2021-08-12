package org.mock.mockitoweb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebService {

	public WebRepository webRepository;
	
	public WebService(WebRepository webRepository) {
		this.webRepository = webRepository;
	}
	
	public int getSquare(int number) {
		return number*number;
	}
	
	public List<Employee> getEmployeeNameAsPerAge(Long age){
		System.out.println("WebService:WebService.getEmployeeNameAsPerAge is called");
		
		List<Employee> employees = webRepository.getEmployees();
		
		System.out.println("WebService:employees.size()"+employees.size());
		
		List<Employee> returnEmployees = new ArrayList<Employee>();
		
		for(Employee employee : employees) {
			int returnAge = employee.getAge();
			if(returnAge <= age) {
				returnEmployees.add(employee);
			}
		}
		
		System.out.println("WebService: returnEmployees.size()"+returnEmployees.size());
		return returnEmployees;
		
	}
}
