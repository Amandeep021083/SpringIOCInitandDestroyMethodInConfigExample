package com.springioc.initandDestroyMethodExample;

public class User {
	private String name;

	public void init(){
		System.out.println("This is init method...");
	}
	
	public void destroy(){
		System.out.println("This is destroy method...");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Inside setter...");
		this.name = name;
	}

}
