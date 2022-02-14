package studentregistartion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import studentregistartion.model.Course;
import studentregistartion.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;
	
	
    @PostMapping("/course/add")
    public void add(@RequestBody Course course) {
    	
    	 courseService.add(course);
    }

    @GetMapping("/allcourses") 
    public List<Course> getAllCourses()
    {
    	
        return courseService.get();
    }
    @GetMapping("/coursebetweenprice")
    public List<Course> getCoursesBetween(Double price)
    {
    	return courseService.getByPrice(price);
    }


	
}
