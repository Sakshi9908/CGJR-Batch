package com.capg.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapgTopicsController {
	
	@Autowired
	CapgTopicsService topicsService;
	
	@RequestMapping("/myController")
	public String display()
	{
		return "Mycontroller"; 
	}
	
   @RequestMapping("/capgtopics")
   public  List<CapgTopics> getAllTopics() {
	   
	
	   
	   return topicsService.getAllMyTopics();
   }
   
   // @PathVariable is used to extract data right form the URI(values from URI itself)
   @RequestMapping("/capgtopics/{id}")
   public CapgTopics getTopic(@PathVariable String id)
   {
	   return topicsService.getTopic(id);
   }
   
   @RequestMapping(method=RequestMethod.POST,value="/capgtopics")
   public void addTopic(@RequestBody CapgTopics topic)
   {  
	   System.out.println(topic.toString());
	   
	   topicsService.addTopic(topic);
   }
   
   
   
   
   
}