package com.scalable.servicetwo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.scalable.servicetwo.model.ServiceTwoModel;
@Repository
public interface ServiceTwoRepository extends  CrudRepository<ServiceTwoModel, Integer>  
{
	
}
