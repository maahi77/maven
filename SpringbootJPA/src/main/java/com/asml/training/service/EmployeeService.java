package com.asml.training.service;
/* 
 * 
 * @author mahendra
 * @since 2021-12-10
 *
 */

import org.springframework.stereotype.Service;

import com.asml.training.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void add(Employee e);
    void update(Employee e);
    List<Employee> get();
    List<Employee> findByNameAndEmail(String name,String email);
	List<Employee> findByname(String name);
}
