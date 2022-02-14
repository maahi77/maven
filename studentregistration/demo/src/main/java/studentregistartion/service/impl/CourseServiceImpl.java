package studentregistartion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studentregistartion.dao.impl.CourseDaoImpl;
import studentregistartion.model.Course;
import studentregistartion.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	
	@Autowired
	CourseDaoImpl courseDaoImpl;
	@Override
	public void add(Course e) {
		
		courseDaoImpl.add(e);
		
	}
	@Override
	public List<Course> get() {
		return courseDaoImpl.getAll();
	}
	@Override
	public List<Course> getByPrice(Double price) {
		return courseDaoImpl.searchBYPrice(price);
	}

}
