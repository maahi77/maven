package studentregistartion.dao.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;


import studentregistartion.dao.AbstractDao;
import studentregistartion.model.Course;

@Repository
public class CourseDaoImpl extends AbstractDao<Course> {
	
    public final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("local");

	public void add(Course e) {
		
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(e);
        tx.commit();
	}
	
    	public List<Course> getAll() {
    		
            EntityManager manager = entityManagerFactory.createEntityManager();
            TypedQuery<Course> namedQuery = manager.createNamedQuery("course.findall", Course.class);
            return Optional.ofNullable(namedQuery.getResultList()).orElse(Collections.emptyList());

    	}

		public List<Course> searchBYPrice(Double price) {
			EntityManager manager=entityManagerFactory.createEntityManager();
	    	CriteriaBuilder cb=manager.getCriteriaBuilder();
	    	CriteriaQuery cq=cb.createQuery();
	    	Root<Course> courseprice=cq.from(Course.class);
	        cq.select(courseprice).where(cb.between(courseprice.get("price"),100.00,200.00));
	    	TypedQuery<Course> query=manager.createQuery(cq);
	    	return Optional.ofNullable(query.getResultList()).orElse(Collections.emptyList());

		}


}

