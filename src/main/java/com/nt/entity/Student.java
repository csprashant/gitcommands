package com.nt.entity;

public class Student {
	private String name;
	private int rollno;
	private float per;
	private float stipend;
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public float getStipend() {
		return stipend;
	}
	public void setStipend(float stipend) {
		this.stipend = stipend;
	}
	public Student() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", per=" + per + ", stipend=" + stipend + "]";
	}
	

}
