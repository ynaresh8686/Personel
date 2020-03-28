package com.naresh.model;

public class Helloworld {

	String name;
	
	Helloworld(String name){
		this.name=name;
	}
	
	public void sayHello(){
		System.out.println("Welcome to Spring World ::)" +name);
	}
}
