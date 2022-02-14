package studentregistartion.service;


import java.util.List;


import studentregistartion.model.Course;

public interface CourseService {

	
	public void add(Course e);
    List<Course> get();
    List<Course> getByPrice(Double price);
}
