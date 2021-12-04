package com.mahendra.jpaexample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NamedNativeQuery {

		public List<Student> getAllEmployeesByDeptId(Integer rollnumber) {
	
		EntityManagerFactory emfactory=Persistence.createEntityManagerFactory("mahendra");
		EntityManager entitymanager=emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		entitymanager.getTransaction().commit();


	    List<Student> student = entitymanager.createNamedQuery("findbyroolnumber", Student.class)
	                                            .setParameter(9, rollnumber)
	                                            .getResultList();
	    return student;
	    
	    
	    
		

	    
	}
	}

