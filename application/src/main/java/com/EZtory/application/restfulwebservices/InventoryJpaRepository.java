package com.EZtory.application.restfulwebservices;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryJpaRepository extends JpaRepository<Inventory, Long> {
	//List<Inventory>findByUsername(String username);
	//public List<Inventory> findAll();
	
}
