package com.asml.training.repository;
/* 
 * 
 * @author mahendra
 * @since 2021-12-10
 *
 */
import org.springframework.stereotype.Component;

import com.asml.training.entity.Employee;

import javax.persistence.*;

@Component
public abstract class AbstarctDao<T> {

    public final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("local");
    public void add(T e){
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(e);
        tx.commit();
    }

    public void update(T e){
        EntityManager manager = entityManagerFactory.createEntityManager();
        manager.merge(e);
    }
}
