package curd.employee.controller;

import java.util.List;

//import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	// Search Employee Page
	@GetMapping("/searchPage")
	public String searchPage(Long id) {
		return "search";
	}
	
	// Search Employee
	@PostMapping("/search")
	public String searchEmployee(Long id, Model model) {
		Employee emp = service.searchEmployee(id);
		model.addAttribute("empObj", emp);
		return "searchResult";
	}
	
	// Get All Employee
	@GetMapping("/ViewAll")
	public String getAllEmployees(Model model) {
		List<Employee> empList = service.getAllEmployees();
		System.out.println(empList);
		model.addAttribute("empList", empList);
		return "ViewAll";
	}
	
	
}





//
//// Get Mapping By Id
//@GetMapping("/employee/{id}")
//public Optional<Employee> employeeById(@PathVariable Long id) {
//	return service.employeeById(id);
//}