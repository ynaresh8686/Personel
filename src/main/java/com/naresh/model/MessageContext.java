package com.naresh.model;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageContext {

	
	MessageContext(){
		populate();
	}
	
	
	private Innova innova;
	
	
	Insurence insurence;
	
	@Autowired
	public void setInnova(Innova innova) {
		this.innova = innova;
		System.out.println("insurence Message"+innova);
	}
	@Autowired
	public void setInsurence(Insurence insurence) {
		this.insurence = insurence;
		System.out.println("insurenceMessage"+insurence);
	}
	
	private static void  populate(){
		//innova.test();
		
	}
	
}
