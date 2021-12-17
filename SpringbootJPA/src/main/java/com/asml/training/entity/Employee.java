package com.asml.training.entity;
/* 
 * 
 * @author mahendra
 * @since 2021-12-10
 *
 */



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
        @NamedQuery(name = "Employee.findAll",query = "SELECT e FROM Employee e")
})
@NamedQuery(name="Employee.findByName",query="SELECT e FROM Employee e WHERE e.name=?1")
/* 
 * @author mahendra
 * 
 * Employee class contains details 
 * about employees
 *
 */
@Entity
public class Employee {
    @Id
    private Long id;
    private String name;
    private String email;

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

	public Employee(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email=email;
    }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	


}
