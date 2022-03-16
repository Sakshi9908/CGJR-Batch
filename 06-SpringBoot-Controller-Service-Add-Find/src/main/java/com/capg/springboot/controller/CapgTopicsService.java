package com.capg.springboot.controller;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class CapgTopicsService {
	
	
	public  List topics=Arrays.asList(new CapgTopics("SpringBoot","Spring MVC","Spring"),
            new CapgTopics("J2SE Technologies","JDBC","JAVA"),
            new CapgTopics("JPA","Hibernate","ORM"));
	
	 List<CapgTopics> myTopics = new ArrayList<CapgTopics>(topics);
	
	 public List<CapgTopics>getAllMyTopics()
	 {
		
           return myTopics;
	 }
	 
	 public  CapgTopics getTopic(String id)
	 {
		 return (CapgTopics)topics.stream().filter(t->((CapgTopics)t).getId().equals(id)).findFirst().get();
	 }
	 
	 
	 public void addTopic(CapgTopics topic)
	 {  
		
		 myTopics.add(topic);
	 }

}
