package studentregistartion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import studentregistartion.model.Student;
import studentregistartion.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	
    @PostMapping("/students/add")
    public void add(@RequestBody Student student) {
    	
    	studentService.add(student);
    }

    @GetMapping("/allstudents")
    public List<Student> getAllStudents ()
    {
    	
        return studentService.get();
    }
    
    @GetMapping("/student/{name}")
    public List<Student> getByDays (@PathVariable(value="name") String name)
    {
        return studentService.findByName(name);
    }



}


