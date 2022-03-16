package com.capg.springboot.controller;

public class CapgTopics {

	private String name;
	
	private String dscription;
	private String id;
	
	public CapgTopics() {
		
	}
	
	public CapgTopics(String name,String description,String id) {
		
		this.name=name;
		this.dscription=description;
		this.id=id;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDscription() {
		return dscription;
	}

	public void setDscription(String dscription) {
		this.dscription = dscription;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String toString()
	{
		return name+dscription+id;
	}
	
	
	
	
}
