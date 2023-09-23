package com.examly.springapp.controllers;

@RestController
public class ApiController {

    @Autowired
    CustomerRepo custRepo;

    @GetMapping("/{id}")
	public Optional<Customar> getEmpDetails(@PathVariable(value = "id") int custId) {

		System.out.println("inside controller " + custId);
		Optional<Customer> customer = custRepo.findById(custId);
		if (customer != null) {
			return customer;
		} else {
			return null;
		}
	}
    
}
