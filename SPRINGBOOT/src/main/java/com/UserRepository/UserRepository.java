package com.UserRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	
    User findByEmailAddress(String eadd);

    List < User > findByLastname(String lname);

	
	

}
