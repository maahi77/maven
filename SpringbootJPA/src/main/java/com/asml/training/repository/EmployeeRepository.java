package com.asml.training.repository;
/* 
 * 
 * @author mahendra
 * @since 2021-12-10
 *
 */


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.asml.training.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	
	
}
