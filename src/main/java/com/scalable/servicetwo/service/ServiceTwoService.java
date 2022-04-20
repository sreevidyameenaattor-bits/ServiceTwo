package com.scalable.servicetwo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.scalable.servicetwo.model.ServiceTwoModel;
import com.scalable.servicetwo.repository.ServiceTwoRepository;

@Service
public class ServiceTwoService {

	@Autowired  
	ServiceTwoRepository usersRepository;  
	
	public void saveOrUpdate(ServiceTwoModel users)   
	{  
		usersRepository.save(users);  
	}  
	
	public void update(ServiceTwoModel users, int empId)   
	{  
		usersRepository.save(users);  
	}  
	public List<ServiceTwoModel> getAllEmployees(){
		List<ServiceTwoModel> users = new ArrayList<ServiceTwoModel>();  
		usersRepository.findAll().forEach(user1 -> users.add(user1));  
		return users;  
	}
}
