package com.mahendra.jpaexample;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Emp1")
@NamedQuery(name="Student.findall",query="SELECT e from Student e ")
@NamedNativeQuery(name="Student.findbyroolnumber",query="select * from Student where rollnumber=?1")
public class Student implements Serializable {
	@Id
	private int rollnumber;
	private String name;
	private String grade;
	
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", grade=" + grade + "]";
	}
	
	

}
