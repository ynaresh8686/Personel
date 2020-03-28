package com.naresh.model;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Repository(value="maruthi")
//@Service(value="maruthi")
//@Component(value="maruthi")
public class Maruti implements Car {
	
	@Override
	public String display() {
		// TODO Auto-generated method stub
		
		System.out.println("From Maruthi");
		
		return "mAruthi";
		
	}

}
