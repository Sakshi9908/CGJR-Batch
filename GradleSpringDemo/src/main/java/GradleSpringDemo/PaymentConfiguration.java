package GradleSpringDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfiguration {
	@Bean("payment")
	
	public Payment getAmount() {
		Payment pay = new Payment();
		pay.setAmount(60000f);
		return pay;
	}
	public Person getPerson() {
		Person obj = new Person();
		obj.setPersonName("Sakshi Shah");
		return obj;
	}
}
