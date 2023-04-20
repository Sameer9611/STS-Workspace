package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
	
	//fingByxxxxx>>>control+Space>>all parameters given
	public List<Employee> findByEmpName(String empName);
	
	@Query(value="select emp_name from employee where salary > ?",nativeQuery = true)//if input is '*' then return type is List<Employee>
	public List findNamesBySalary(int salary);//if output is specific(emp_name) use blank generic else error
	
	@Modifying//`@Modifying` annotation include INSERT, UPDATE, DELETE, and DDLstatements.
	@Transactional
	@Query(value="update employee set salary=? where empid=?",nativeQuery = true)
	public void updateSalary(int salary,int empid);
	
}	
