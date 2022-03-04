package com.jpaexample.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.javabydeveloper.domain.Emp;

public class DeleteEmployee {
	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager entityManager = null;

		try {
			emf = Persistence.createEntityManagerFactory("Emp");
			entityManager = emf.createEntityManager();
			EntityManager em = emf.createEntityManager();
			
			em.getTransaction().begin();
			
			Query q = em.createQuery("delete from Emp where empno=5");
			q.executeUpdate();
			em.getTransaction().commit();
			em.close();
			emf.close();
			System.out.println("Deleted record successfully.");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
