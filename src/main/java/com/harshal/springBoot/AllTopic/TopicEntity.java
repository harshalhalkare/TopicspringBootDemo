package com.harshal.springBoot.AllTopic;

public class TopicEntity {

	private String name;
	private String description;
	private String course;
	


	public TopicEntity(String name, String description, String course) {
		super();
		this.name = name;
		this.description = description;
		this.course = course;
		
	}


	public TopicEntity() {

	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}





}
