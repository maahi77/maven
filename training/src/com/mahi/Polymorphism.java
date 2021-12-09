package com.mahi;

public class Polymorphism {
	void run() {
		System.out.println("running");
	}

}
class Poly extends Polymorphism{
	void run(){
	System.out.println("running fastly");

	}
}
class Maaahi{
	public static void main(String[] args)
	{
		Poly p=new Poly();
		p.run();
	}
}
//method loading
class Adder{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
}  
class TestOverloading1{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(11,11,11));  
}}  

