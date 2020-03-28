package com.naresh.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="message")
@Scope("prototype")
public class Message {
	
	
	private String name;
	
	private String address;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
