package curd.employee.service;


//import java.util.List;
//import java.util.Optional;

import curd.employee.entity.Employee;

public interface EmployeeService {
	
	void createNewEmployee(Employee em); // Create Method
	
	void updateEmployee(Employee em); // frnt, contro, ser, repo, data
	
	void deleteEmployee(Long id);

	Employee searchEmployee(Long id);

	//List<Employee> getAllEmployee(); // Get All Employee Method for RestController
	
}


//
//	Optional<Employee> employeeById(Long id); // Get By Id Method

