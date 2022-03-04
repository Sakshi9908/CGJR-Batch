package com.jpaexample.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.javabydeveloper.domain.Emp;

public class UpdateEmployee {
	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager entityManager = null;

		try {
			emf = Persistence.createEntityManagerFactory("Emp");
			entityManager = emf.createEntityManager();
			EntityManager em = emf.createEntityManager();
			
			em.getTransaction().begin();
			
			Query q = em.createQuery("update Emp SET empname='Sanjal' where empno=5");
			q.executeUpdate();
			em.getTransaction().commit();
			em.close();
			emf.close();
			System.out.println("Updated record successfully.");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
