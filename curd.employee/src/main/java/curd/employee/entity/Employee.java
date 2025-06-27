package curd.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	Long id;
	
	String name;
	
	String Department;
	
	int Salary;
	
	
	public Employee() {
		super();
	}


	public Employee(Long id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
		Salary = salary;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		Department = department;
	}


	public int getSalary() {
		return Salary;
	}


	public void setSalary(int salary) {
		Salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Department=" + Department + ", Salary=" + Salary + "]";
	}
	
	

}
