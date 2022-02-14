package studentregistartion.service;

import java.util.List;

import studentregistartion.model.Student;


public interface StudentService {
	
	public void add(Student e);

	public List<Student> get();
	public List<Student>  findByName(String name);


}
