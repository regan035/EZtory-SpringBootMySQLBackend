package com.EZtory.application.restfulwebservices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserJPARepository extends JpaRepository<User, Long> {
	
}
