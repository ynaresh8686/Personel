package com.naresh.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="contextFactory")
public class ContextFactory {
	
	@Autowired
	ApplicationContext appcontext;
	
	public void account(){
		Message msg=populate();
		System.out.println(msg.getAddress());
		System.out.println(msg.getName());
	}
	
private  Message populate(){
	
		Message msg=null;
		
		msg=(Message) appcontext.getBean("message");
		
		msg.setAddress("Kanigiri");
		
		msg.setName("NARESH");
		System.out.println("1nd hashcode"+msg.hashCode());
		
		msg=(Message) appcontext.getBean("message");
		
		System.out.println("2nd hashcode"+msg.hashCode());
		
		//msg.setAddress("Kanigiri2");
		
		//msg.setName("NARESH2");
		
		
		return msg;
		
	}

}
