package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController //controller can also be used ,restcontroller has @responsebody extra,explained by sir?
@RequestMapping("/employee")//incase of multiple controllers
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
//	EmployeeService employeeService = new EmployeeService();//replicates this
	
	//void
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {//requestbody(utimately RestApi)converts json data to Employee type
		 Employee employee2= employeeService.saveEmployee(employee);
		 return ResponseEntity.ok().body(employee2);
	}
	@DeleteMapping("/delete/{empID}")
	public void deleteEmployee(@PathVariable Integer empID) {
		employeeService.deleteEmployee(empID);
	}
	@DeleteMapping("/deletebyParameter")
	public void deleteEmployeeparameter(@RequestParam Integer empID) {
		employeeService.deleteEmployee(empID);	
	}
	@DeleteMapping("/deletebyBody")
	public void deleteEmployeeBody(@RequestBody Integer empID) {
		employeeService.deleteEmployee(empID);	
	}
	
	@GetMapping("/CrudgetbyID/{id}")
	public Optional<Employee> crudFIndBy(@PathVariable int id){
		return employeeService.crudFIndBy(id);	
	}
	@GetMapping("/findbyname")
	public List<Employee> findByName(@RequestParam String name){
		return employeeService.findbyname(name);	
	}
	@GetMapping("/getnamesbysalary>than/{salary}")
	public List<Employee> findNamesBySalary(@PathVariable int salary){
		return employeeService.findNamesBySalary(salary);
	}
	@PutMapping("/updateSalary")
	public void updateSalarybyempid(@RequestParam int newSalary,@RequestParam int empid) {
		employeeService.updateSalarybyempid(newSalary, empid);
	}
	
	

}
  