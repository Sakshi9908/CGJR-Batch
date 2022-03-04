package com.jpaexample.criteriaquery;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.javabydeveloper.domain.Emp;

public class EmployeeFetchEx {
	public static void main(String[] args) {
		/*try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Emp");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Emp> cq = cb.createQuery(Emp.class);
			Root<Emp> emp = cq.from(Emp.class);
			
			CriteriaQuery<Emp> select = cq.select(emp);
			
			
			System.out.println("After insert of list Employee: ");
			for(Emp next: resultList1) {
				System.out.println("Employee No: " +next.getEmpno());
				System.out.println("Employee Name: "+ next.getEmpname());
			}
		}catch(Exception e) {
			System.out.println(e);
		}*/
	}

}
