package org.mock.mockitoweb;

import java.util.ArrayList;
import java.util.List;

public class WebService {

	public WebRepository webRepository;
	
	public WebService(WebRepository webRepository) {
		this.webRepository = webRepository;
	}
	
	public int getSquare(int number) {
		return number*number;
	}
	
	public List<Employee> getEmployeeNameAsPerAge(int age){
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
	
	public List<Employee> getEmployeeNameAsPerSalary(Long salary){
		System.out.println("WebService:WebService.getEmployeeNameAsPerAge is called");
		
		List<Employee> employees = webRepository.getEmployees();
		
		System.out.println("WebService:employees.size()"+employees.size());
		
		List<Employee> returnEmployees = new ArrayList<Employee>();
		
		for(Employee employee : employees) {
			Long returnSalary = employee.getSalary();
			if(returnSalary <= salary) {
				returnEmployees.add(employee);
			}
		}
		
		System.out.println("WebService: returnEmployees.size()"+returnEmployees.size());
		return returnEmployees;
		
	}
}
