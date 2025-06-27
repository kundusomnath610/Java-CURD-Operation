package curd.employee.controller;

//import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import curd.employee.entity.Employee;
import curd.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	// Create Employee Record in DataBase
	@PostMapping("/create")
	public void createNewEmployee(@ModelAttribute Employee emp) {
		service.createNewEmployee(emp);
	}
	
	@GetMapping("/createPage")
	public String createPage() {
		return "create";
	}
	
	// Update The record
	@PostMapping("/update")
	public void updateEmployee(@ModelAttribute Employee emp) {
		service.updateEmployee(emp);
	}
	
	@GetMapping("/updatePage")
	public String updatePage() {
		return "update";
	}
	
	//Delete Employee
	@GetMapping("/deletePage")
	public String deletePage() {
		return "delete";
	}
	
	@PostMapping("/delete")
	public void deleteEmployee(Long id) {
		service.deleteEmployee(id);
	}
	
	@GetMapping("/searchPage")
	public String searchPage(Long id) {
		return "search";
	}
	
	@PostMapping("/search")
	public Employee searchEmployee(Long id) {
		Employee employee = service.searchEmployee(id);
		System.out.println(employee);
		return employee;
	}
	
	
}





//
//// Get Mapping By Id
//@GetMapping("/employee/{id}")
//public Optional<Employee> employeeById(@PathVariable Long id) {
//	return service.employeeById(id);
//}