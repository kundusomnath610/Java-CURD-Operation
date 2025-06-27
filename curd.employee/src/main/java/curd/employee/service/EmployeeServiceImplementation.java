package curd.employee.service;

//import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curd.employee.entity.Employee;
import curd.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
		
	@Autowired
	EmployeeRepository repo;
	
	// Create the entry in dataBase
	public void createNewEmployee(Employee emp) {
		repo.save(emp);
	}
	
	public void updateEmployee(Employee emp) {
		repo.save(emp);
	}
	
	public void deleteEmployee(Long id) {
		repo.deleteById(id);
	}
	
	public Employee searchEmployee(Long id) {
		return repo.findById(id).get();
	}

//	public List<Employee> getAllEmployee() {
//		return repo.findAll();
//	}
	
	
}





//	@Override
//	public List<Employee> getAllEmployee() {
//		return repo.findAll();
//	}
//
//	@Override
//    public Optional<Employee> employeeById(Long id) {
//        return repo.findById(id);
//    }

