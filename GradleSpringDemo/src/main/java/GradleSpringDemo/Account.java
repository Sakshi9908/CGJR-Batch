package GradleSpringDemo;

import javax.annotation.*;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Account {
	private String accountName;
	
	@Autowired
	@Qualifier("person1")
	private Person person;
	
	public Account() {}
	
	public Account(Person person) {
		this.person=person;
	}

	public Account(String accountName) {
		super();
		this.accountName = accountName;
		
		
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	
	public Person getPerson() {
		return person;
	}
	
	@Resource(name="person1")
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@PostConstruct
	public void beanInit() {
		System.out.println("Person bean initialized");
	}
	
	@PreDestroy
	public void beanRemoved() {
		System.out.println("Bean to be removed");
	}
}
