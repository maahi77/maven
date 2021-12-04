package com.mahendra.jpaexample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class Test {
	public static void main(String args[])
	{
		
		Student student=new Student();
		student.setRollnumber(33);
		student.setName("mahend");
		student.setGrade("d");
		EntityManagerFactory emfactory=Persistence.createEntityManagerFactory("mahendra");
		EntityManager entitymanager=emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		entitymanager.persist(student);
		entitymanager.getTransaction().commit();
		//entitymanager.close();
		
		entitymanager.getTransaction().begin();
		Query q=entitymanager.createNamedQuery("Student.findall", Student.class);
		List<Object[]> mani =(List<Object[]>) q.getResultList();	
		System.out.println("Student"+ mani);
		//for (Object[] ob : mani) {
			//System.out.println("Student"+ ob[0]+""+ob[1]);

			
			
		//}
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
		
		
		
	}

}