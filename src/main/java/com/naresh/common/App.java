package com.naresh.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.model.Exam;
import com.naresh.model.Helloworld;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ApplicationContext contxt= new ClassPathXmlApplicationContext("applicationcontext.xml");
           Exam hw=(Exam) contxt.getBean("exam");
           hw.display();
           
	}

}
