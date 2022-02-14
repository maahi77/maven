package com.mahi;
import java.util.stream.*;
import java.util.*;

public class Streams {
	public static void main(String args[])
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(36);
		List<Integer> l2=l.stream().filter(i->i<35).collect(Collectors.toList());
		System.out.println(l2);
		List<Integer> l3=l.stream().map(i->i+35).collect(Collectors.toList());
		System.out.println(l3);
		Long l4=l.stream().filter(i->i<35).count();
		System.out.println(l4);
		List<Integer> l5=l.stream().sorted().collect(Collectors.toList());
		System.out.println(l5);

		

		





		
	}
	

}
