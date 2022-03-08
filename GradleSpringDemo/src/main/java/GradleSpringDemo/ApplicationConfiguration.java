package GradleSpringDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class ApplicationConfiguration {
	@Bean("person")
	public Person getPerson() {
		Person obj = new Person();
		obj.setPersonName("Sakshi Shah");
		return obj;
	}
}
