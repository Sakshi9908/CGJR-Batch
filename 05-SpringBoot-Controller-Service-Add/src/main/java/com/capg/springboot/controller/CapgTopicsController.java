package com.capg.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CapgTopicsController {
	//CapgTopicsService topicService = new CapgTopicsService();
	
	@Autowired
	CapgTopicsService topicService;
	
	@RequestMapping("/myController")
	public String display() {
		return "My CapG Controller Topics";
	}
	
	@RequestMapping("/capgtopic")
	public List<CapgTopics> getAllTopics(){
		return topicService.getAllMyTopics();
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/capgtopic")
	public void addTopic(@RequestBody CapgTopics topic) {
		topicService.addTopic(topic);
	}
}