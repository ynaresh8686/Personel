package com.naresh.model;

public class Answer {
	@Override
	public String toString() {
		return "Answer [id=" + id + ", ans=" + ans + "]";
	}
	private int id;
	private String ans;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}

}
