package com.mahi;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
	public static void main(String args[])
	{
		Predicate<Integer> p=n->n%2==0;
		System.out.println(p.test(10));
		System.out.println(p.test(9));
		Function<Integer, Integer> q=i->i*i;
		System.out.println(q.apply(10));
		Consumer<String> c=s->System.out.println(s);
		c.accept("mahi");
		Supplier<String> s=()->{
			String OTP="";
			for(int i=0;i<5;i++) {
				OTP +=(int)(Math.random()*10);
			}
			return OTP;
					
		};
		System.out.println(s.get());




	}

}
