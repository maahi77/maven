package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Loptop {
	private int bno;
	private String company;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void Cmpile() {
		System.out.println("compiling");
	}

}
