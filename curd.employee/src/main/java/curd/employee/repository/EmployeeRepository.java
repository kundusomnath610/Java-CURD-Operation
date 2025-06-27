package curd.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import curd.employee.entity.Employee;

public interface EmployeeRepository extends 
		JpaRepository<Employee, Long> {
	
	
}
