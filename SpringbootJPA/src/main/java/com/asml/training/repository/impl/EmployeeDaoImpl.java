package com.asml.training.repository.impl;

import com.asml.training.entity.Employee;
import com.asml.training.repository.AbstarctDao;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Repository
public class EmployeeDaoImpl extends AbstarctDao<Employee> {
    public final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("local");
    public void add(Employee e){
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(e);
        tx.commit();
    }

    public void update(Employee e){
        EntityManager manager = entityManagerFactory.createEntityManager();
        manager.merge(e);
    }
    
    public List<Employee> findAll(){
        EntityManager manager = entityManagerFactory.createEntityManager();
        TypedQuery<Employee> namedQuery = manager.createNamedQuery("Employee.findAll", Employee.class);
        return Optional.ofNullable(namedQuery.getResultList()).orElse(Collections.emptyList());
    }
    
    public List<Employee> getByName(String name) {
    	EntityManager manager=entityManagerFactory.createEntityManager();
    	TypedQuery<Employee> namedQuery=manager.createNamedQuery("Employee.findByName", Employee.class);
    	namedQuery.setParameter("name",name);
         return namedQuery.getResultList();
    	
    }
	public List<Employee> getbynameandemail(String name, String email) {
		// TODO Auto-generated method stub
    	EntityManager manager=entityManagerFactory.createEntityManager();
    	CriteriaBuilder cb=manager.getCriteriaBuilder();
    	CriteriaQuery cq=cb.createQuery();
    	Root<Employee> employee=cq.from(Employee.class);
    	javax.persistence.criteria.Predicate namePredicate=cb.equal(employee.get("name"),name);
    	javax.persistence.criteria.Predicate emailPredicate=cb.equal(employee.get("email"),email);
    	cq.where(namePredicate,emailPredicate);
    	TypedQuery<Employee> query=manager.createQuery(cq);
    	return query.getResultList();

	}

    
}


