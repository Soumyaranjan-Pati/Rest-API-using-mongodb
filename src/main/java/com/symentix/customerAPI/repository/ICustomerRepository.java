package com.symentix.customerAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.symentix.customerAPI.dto.Customer;

@Repository
public interface ICustomerRepository extends MongoRepository<Customer,Integer>{

}
