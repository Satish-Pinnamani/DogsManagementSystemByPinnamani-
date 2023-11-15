package com.pinnamaniClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pinnamaniClasses.DMS.Models.Dog;

/**
 * @author Purna Chandra Satish Pinnamani
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {
	
	List<Dog> findByName(String name);

}
