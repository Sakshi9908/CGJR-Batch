package com.javabydeveloper;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.javabydeveloper.domain.Emp;

public class InsertEmployee {
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
			Emp emp1 = new Emp();
			emp1.setEmpno(3);
			emp1.setEmpname("Smita");
			Emp emp2 = new Emp();
			emp2.setEmpno(4);
			emp2.setEmpname("Sakshi");
			Emp emp3 = new Emp();
			emp3.setEmpno(5);
			emp3.setEmpname("Suvidhee");
			em.persist(emp1);
			em.persist(emp2);
			em.persist(emp3);
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
