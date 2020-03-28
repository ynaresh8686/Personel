package com.naresh.model;

import org.springframework.stereotype.Component;

@Component(value="innova")
public class Innova implements Car{

	@Override
	public  String  display() {
		// TODO Auto-generated method stub
		System.out.println("from Innova");
		
		return "toYota";
	}
	
	public static  void test(){
		System.out.println("this is text");
	}

}
