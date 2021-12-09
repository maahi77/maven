package com.model;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@NamedQuery(name = "User.findByemailaddress", query = "select u from User u where u.eadd = ?1")
@NamedQueries(value = {
    @NamedQuery(name = "User.findByLastname", query = "select u from User u where u.lname = ?1")
})
public class User {
	
	private long id;
	private String fname;	
	private String lname;
	private String eadd;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", eadd=" + eadd + "]";
	}	
	



}
