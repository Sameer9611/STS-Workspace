package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@SpringBootTest
public class EmployeeServiceTests {
	
	
	@Mock
	private EmployeeRepository employeeRepository;
	
	@InjectMocks
	private EmployeeService employeeService;


	@Test//so now we are checking the service layer where actual logic is present
	public void saveEmployeeTest() {
		//1)ready the repository layer: mock that we have a Employee to save and repo method save and returms the same
		Employee employee = new Employee(1, "vikas", "vakilvasti", 25000);
		
		when(employeeRepository. save(employee)).thenReturn(employee);
		
		
		//2)now check by assert that employee we have and employee that employeeService.saveEmployee returns is same or not
		assertEquals(employee, employeeService.saveEmployee(employee));
		//employeeService.saveEmployee(employee)>>>goes to service layer>>calls >>employeeRepository. save(employee) , we have told to return (employee)
		//(from controller)
		
		//returned and inputed employee matches hence all good
	}
	@Test
	public void findbynameTest() {
		Employee employee = new Employee(1, "vikas", "vakilvasti", 25000);
		List<Employee> expectedEmpList = new ArrayList<>();
		expectedEmpList.add(employee);
		
		when(employeeRepository.findByEmpName("vikas")).thenReturn(expectedEmpList);
		
		List<Employee> returnedlist=employeeService.findbyname("vikas");//check by entering vika
		assertEquals(expectedEmpList,returnedlist );		
	}
	@Test
	public void deleteEmployeeTest() {
		Employee employee = new Employee(1, "vikas", "vakilvasti", 25000);
		//employeeRepository.save(employee);>>no need
		//also no need of when().thenReturn()>>as repository has no returntype
		employeeRepository.deleteById(employee.getEmpID());
		Optional<Employee> returnedEmp=employeeRepository.findById(employee.getEmpID());
		
		assertEquals(Optional.empty(),returnedEmp );//for optional (null==optional.empty())
		
	}
	
	
	
	

}
