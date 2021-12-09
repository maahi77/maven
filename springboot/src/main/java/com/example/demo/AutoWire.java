package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutoWire {
	
private String name;
private int num;
private String add;
@Autowired
private Loptop loptop;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}

public Loptop getLoptop() {
	return loptop;
}
public void setLoptop(Loptop loptop) {
	this.loptop = loptop;
}
public void show() {
	System.out.println("In show");
	loptop.Cmpile();
}
}
