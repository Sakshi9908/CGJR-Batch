package com.javabydeveloper;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.javabydeveloper.domain.Emp;
 

/**
 * JPA Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
 
		try {
			emf = Persistence.createEntityManagerFactory("Emp");
			entityManager = emf.createEntityManager();
		 

			Query q = entityManager.createQuery("select e from Emp e");

			List<Emp> resultList = q.getResultList();
			System.out.println("num of employees:" + resultList.size());
			for (Emp next : resultList) {
				System.out.println("Employee:No " + next.getEmpno());
				System.out.println("Employee:Name " + next.getEmpname());
			}

		} catch (Exception e) {
			System.out.println(e); 
		}  
	}
}
