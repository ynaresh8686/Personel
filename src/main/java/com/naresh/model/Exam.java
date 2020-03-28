package com.naresh.model;

import java.util.List;
import java.util.jar.Attributes.Name;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import com.naresh.scope.ContextFactory;

public class Exam {
	
	private int id;
	
	@Value("${firstname}")
	private String qtn;
	
	@Autowired
	private List<Answer> ans;
	
	
	/*@Resource
	private Car maruthi;
	*/
	@Autowired
	//@Qualifier(value="innova")
	private Car car ;
	
	//@Autowired
	//private Maruti maruthi;
	
	@Autowired
	private Insurence insurence;
	
	//@Autowired
	//private Innova innova;
	
	@Autowired
	private ContextFactory ctx;
	
	
	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

	Exam(){
		
	}
	
	public void display(){
		//System.out.println("from display" +maruthi.display());
		ctx.account();
		MessageContext messagectx=new MessageContext();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQtn() {
		return qtn;
	}

	public void setQtn(String qtn) {
		this.qtn = qtn;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", qtn=" + qtn + ", ans=" + ans + "]";
	}

	public void setCar(Car car) {
		this.car = car;
		System.out.println("car in exam"+this);
	}

	public void setInsurence(Insurence insurence) {
		
		this.insurence = insurence;
		System.out.println("ins in exam"+this);
	}
	
	
	/*public void setInnova(Innova innova) {
		this.innova = innova;
		System.out.println("innova in exam"+innova);
	}*/

	
}
