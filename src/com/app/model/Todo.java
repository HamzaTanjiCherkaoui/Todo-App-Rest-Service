package com.app.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="todo")

public class Todo {
	int id;
	String task ; 
	boolean state;
	
	public Todo() {
	
		// TODO Auto-generated constructor stub
	}
	public Todo(int id,String task, boolean state) {
		super();
		this.id =id;
		this.task = task;
		this.state = state;
	}
	
	@XmlElement
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@XmlElement
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	@XmlElement
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
}
