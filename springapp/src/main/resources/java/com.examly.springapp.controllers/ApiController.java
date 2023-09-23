package com.examly.springapp.controllers;

@RestController
public class ApiController {

    @GetMapping("/employee/{id}")
	public Optional<Employee> getEmpDetails(@PathVariable(value = "id") int empId) {

		EmpDTO response = null;

		System.out.println("inside controller " + empId);
		Optional<Employee> employee = employeeService.findEmpById(empId);
		if (employee != null) {
			return employee;
		} else {
			return null;
		}
	}
    
}
