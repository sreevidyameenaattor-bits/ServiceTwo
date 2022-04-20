package com.scalable.servicetwo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.scalable.servicetwo.model.ServiceTwoModel;
import com.scalable.servicetwo.service.ServiceTwoService;

@RestController
public class ServiceTwoController {
	@Autowired
	ServiceTwoService userService;  
	
	@PostMapping("/users")  
	private int saveBook(@RequestBody ServiceTwoModel users)   
	{  
		userService.saveOrUpdate(users);  
	return users.getEmpId();  
	}  
	//creating put mapping that updates the book detail   
	@PutMapping("/users")  
	private ServiceTwoModel update(@RequestBody ServiceTwoModel users)   
	{  
		userService.saveOrUpdate(users);  
	return users;  
	}  
	@GetMapping("/displayAll")
	public List<ServiceTwoModel> getAllEmployees(){
		return  userService.getAllEmployees();
		
	}
}
