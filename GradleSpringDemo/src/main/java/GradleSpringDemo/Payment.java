package GradleSpringDemo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Payment {
	
	private float amount;
	private String phoneno;
	
	@Autowired
	
	private Person person;
	
	public Payment() {}
	
	
	public Payment(Person person) {
		this.person=person;
	}

	public Payment(float amount, String phoneno) {
		super();
		this.amount = amount;
		this.phoneno = phoneno;
	}

	public float getAmount() {
		return amount;
	}
	
	@Required
	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Person getPerson() {
		return person;
	}

	@Resource(name="person")
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
}
