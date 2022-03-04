package com.javabydeveloper.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the emp database table.
 * 
 */
@Entity
@Table(name="Emp")
@NamedQueries({
	@NamedQuery(name="Emp.findAll", query="SELECT e FROM Emp e"),
	
	@NamedQuery(name="Emp.OrderByEmpName", query="SELECT e FROM Emp e order by empname asc")
})
 public class Emp implements Serializable {

	private static final long serialVersionUID = 7469471348010165686L;

	@Id //primary key field
	@Column(name="EMPNO")// datbase table column name
	private Integer empno;
		
	@Column(name="EMPNAME") // database column name
	private String empname;
	
	
	public Emp() {
	}

	public String getEmpname() {
		return this.empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Integer getEmpno() {
		return this.empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

}