package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//void
	public Employee saveEmployee(Employee employee) {
		  return employeeRepository.save(employee);
	}
	
	public void deleteEmployee(Integer empID) {
		employeeRepository.deleteById(empID);
	}
	public Optional<Employee> crudFIndBy(int id) {
		return employeeRepository.findById(id);
	}
	public List<Employee> findbyname(String name) {
		return employeeRepository.findByEmpName(name);
	}
	public List<Employee> findNamesBySalary(int salary){
		return employeeRepository.findNamesBySalary(salary);
	}
	public void updateSalarybyempid(int newSalary,int empid) {
		employeeRepository.updateSalary(newSalary, empid);
	}

}
