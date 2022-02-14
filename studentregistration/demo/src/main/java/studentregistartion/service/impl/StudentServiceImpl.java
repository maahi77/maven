package studentregistartion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studentregistartion.dao.impl.SudentDaoImpl;
import studentregistartion.model.Student;
import studentregistartion.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	SudentDaoImpl sudentDaoImpl;

	@Override
	public void add(Student e) {
		
		sudentDaoImpl.add(e);	
		
	}

	@Override
	public List<Student> get() {
		return sudentDaoImpl.getAll();
	}

	@Override
	public List<Student> findByName(String name) {
		return sudentDaoImpl.getByName(name);
	}
	

}
