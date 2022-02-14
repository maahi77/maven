package studentregistartion.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;



@Entity
@NamedQueries({@NamedQuery(name = "student.findall",query = "select e from Student e"),
	@NamedQuery(name="student.findbyname", query="select e from Student e where e.name=:name")
	
})

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer studentId;
	private String name;
	private String email;
	public Student() {
		super();
	}
	public Student(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name = "course_students",joinColumns = { @JoinColumn(name="student_Id")},
	inverseJoinColumns = { @JoinColumn(name="course_Id")}
	
			)

	private Set<Course> courses=new HashSet<>();
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", email=" + email + ", courses=" + courses + "]";
	}


	
}
