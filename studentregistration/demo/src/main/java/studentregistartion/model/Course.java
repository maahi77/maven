package studentregistartion.model;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;



@Entity
@NamedQuery(name = "course.findall",query = "select e from Course e")
public class Course implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer courseId;
	private String courseName;
	private Double price;
	
	public Course() {
		super();
	}

	
	@ManyToMany(mappedBy = "courses")
	private Set<Student> students=new HashSet<>();
	


	public Course(String courseName, Double price) {
		super();
		this.courseName = courseName;
		this.price = price;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", price=" + price + ", students="
				+ students + "]";
	}

	
	

}
