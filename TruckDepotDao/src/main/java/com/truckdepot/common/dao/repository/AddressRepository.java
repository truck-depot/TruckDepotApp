package com.truckdepot.common.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.truckdepot.common.dao.entities.Address;


public interface AddressRepository extends CrudRepository<Address, Integer> {
	
	Address findByAddressId(int addressId);
	

}
