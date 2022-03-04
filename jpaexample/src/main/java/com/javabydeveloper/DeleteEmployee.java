package com.javabydeveloper;

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
			Query q = em.createQuery("select e from Emp e");

			List<Emp> resultList = q.getResultList();
			System.out.println("num of employees:" + resultList.size());
			
			System.out.println("Before insert Employee List: ");
			for (Emp next : resultList) {
				System.out.println("Employee No: " + next.getEmpno());
				System.out.println("Employee Name: " + next.getEmpname());
			}
			em.getTransaction().begin();
			Emp emp1 =(Emp)em.find(Emp.class,3);
			em.remove(emp1);
			em.getTransaction().commit();
			Query q1 = em.createQuery("select e from Emp e");
			List<Emp> resultList1 = q1.getResultList();
			System.out.println("After insert of list Employee: ");
			for(Emp next: resultList1) {
				System.out.println("Employee No: " +next.getEmpno());
				System.out.println("Employee Name: "+ next.getEmpname());
			}
			emf.close();
			em.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
