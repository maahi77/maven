package com.mahendra.jpaexample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NamedQuery {
	public static void main(String args[])
	{
		EntityManagerFactory emfactory=Persistence.createEntityManagerFactory("mahendra");
		EntityManager entitymanager=emfactory.createEntityManager();
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
