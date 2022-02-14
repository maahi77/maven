package com.asml.training.controller;
/* 
 * EmployeeController class is used 
 * to process incoming REST API requests, preparing a model, 
 * and returning the view to be rendered as a response.
 * 
 * 
 * @author mahendra
 * @since 2021-12-10
 *
 */


import com.asml.training.entity.Employee;
import com.asml.training.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping(name="hello", path = "/hello")
    public String getEmployee(){
        return "hello";
    }

    @GetMapping(name = "getAll", path="/getAll")
    public List<Employee> getAll(){
        service.add(new Employee(1L, "mani","mahi@gmail.com"));
        service.add(new Employee(2L, "madhu","madhu@gmail.com"));
        service.add(new Employee(3L, "Mahendra","mahendra@gmail.com"));
       return service.get();
    }
    @GetMapping("/Employee/{name}")
    public List<Employee> getByName(@PathVariable(value="name") String name) {
    	
    	return service.findByname(name);
    }
    
    @GetMapping("Employee/{name}/{email}")
    public List<Employee> getbynameandemail(@PathVariable("name") String name,@PathVariable("email") String email){
    	return service.findByNameAndEmail(name, email);
    }


}
