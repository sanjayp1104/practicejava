package com.boot.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.app.model.Customer;

@RestController
public class TestController {
	
	@PostMapping(name="/save-cust-info")
	
	public String custinfo(@RequestBody  Customer cust) {
		
		return "Customer information saved successfully ::." + cust.getCustNo() + " " + cust.getName() + " " + cust.getCountry();
	}
}
