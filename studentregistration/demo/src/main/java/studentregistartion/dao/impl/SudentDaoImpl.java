package studentregistartion.dao.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


import studentregistartion.dao.AbstractDao;
import studentregistartion.model.Student;

@Repository
public class SudentDaoImpl extends AbstractDao<Student> {
	
    public final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("local");

	
	public void add(Student e) {
		
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(e);
        tx.commit();


}
	
	public List<Student> getAll() {
		
        EntityManager manager = entityManagerFactory.createEntityManager();
        TypedQuery<Student> namedQuery = manager.createNamedQuery("student.findall", Student.class);
        return Optional.ofNullable(namedQuery.getResultList()).orElse(Collections.emptyList());

	}
	
	
	
	public List<Student> getByName(String name) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        TypedQuery<Student> namedQuery = manager.createNamedQuery("student.findbyname", Student.class);
        namedQuery.setParameter("name",name);
        return Optional.ofNullable(namedQuery.getResultList()).orElse(Collections.emptyList());

	}


}
