package com.capg.springboot.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CapgTopicsService {
	public List topics=Arrays.asList(new CapgTopics("Spring Boot","Spring MVC", "Spring"),
			 new CapgTopics("J2SE","JDBC", "JAVA"),
			 new CapgTopics("JPA","Hibernate", "ORM"));
	
	List<CapgTopics> myTopics = new ArrayList<CapgTopics>(topics);
	
	public List<CapgTopics> getAllMyTopics(){
		return topics;
	}
	
	public void addTopic(CapgTopics topic) {
		myTopics.add(topic);
	}
}
