package com.asml.training.service;

import org.springframework.stereotype.Service;

import com.asml.training.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void add(Employee e);
    void update(Employee e);
    List<Employee> get();
    Employee getById(long id);
    List<Employee> findByNameAndEmail(String name,String email);
}
