package com.asml.training.service.impl;

import com.asml.training.entity.Employee;
import com.asml.training.repository.impl.EmployeeDaoImpl;
import com.asml.training.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl  implements EmployeeService {
    @Autowired
    EmployeeDaoImpl employeeDao;

    @Override
    public void add(Employee e) {
        employeeDao.add(e);
    }

    @Override
    public void update(Employee e) {
        employeeDao.update(e);
    }

    @Override
    public List<Employee> get() {
        return employeeDao.findAll();
    }
    @Override
    public List<Employee> findByname(String name) {
    	return employeeDao.getByName(name);
    }
    @Override
    public List<Employee> findByNameAndEmail(String name,String email){
    	return employeeDao.getbynameandemail( name, email);
    }
}
